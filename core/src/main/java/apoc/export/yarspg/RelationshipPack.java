package apoc.export.yarspg;

import org.neo4j.graphdb.RelationshipType;

import java.util.Map;

record RelationshipPack(String leftNodeId, RelationshipType relationshipType, String rightNodeId,
                        Map<String, Object> properties) {
}
