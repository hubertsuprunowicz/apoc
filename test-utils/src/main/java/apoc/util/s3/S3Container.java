package apoc.util.s3;

import apoc.util.Util;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.testcontainers.containers.localstack.LocalStackContainer;
import org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static org.testcontainers.containers.localstack.LocalStackContainer.Service.S3;

public class S3Container implements AutoCloseable {
    private final static String S3_BUCKET_NAME = "test-bucket";
    private final LocalStackContainer localstack;
    private final AmazonS3 s3;

    // Container localstack/localstack:1.2.0 started
    public S3Container() {
        final String fullImageName = "localstack/localstack:1.2.0";
        localstack = new LocalStackContainer(DockerImageName.parse(fullImageName))
                .withServices(S3);
//        final String imgNameEscaped = fullImageName.replace(".", "\\.").replace("/", "\\/");
        final String waitRegex = String.format("Container %s started", fullImageName);
        localstack.setWaitStrategy(new LogMessageWaitStrategy()
                .withRegEx("Ready\\.")
                .withStartupTimeout(Duration.ofMinutes(2)));
        localstack.start();

        s3 = AmazonS3ClientBuilder
                .standard()
                .withEndpointConfiguration(getEndpointConfiguration())
                .withCredentials(getCredentialsProvider())
                .build();
        s3.createBucket(S3_BUCKET_NAME);
    }

    public void close() {
        Util.close(localstack);
    }

    public AwsClientBuilder.EndpointConfiguration getEndpointConfiguration() {
        return localstack.getEndpointConfiguration(S3);
    }

    public AWSCredentialsProvider getCredentialsProvider() {
        return localstack.getDefaultCredentialsProvider();
    }

    public String getUrl(String key) {
        return String.format("s3://%s.%s/%s/%s?accessKey=%s&secretKey=%s",
                localstack.getEndpointConfiguration(S3).getSigningRegion(),
                localstack.getEndpointConfiguration(S3).getServiceEndpoint()
                        .replace("http://", ""),
                S3_BUCKET_NAME,
                key,
                localstack.getDefaultCredentialsProvider().getCredentials().getAWSAccessKeyId(),
                localstack.getDefaultCredentialsProvider().getCredentials().getAWSSecretKey());
    }
}
