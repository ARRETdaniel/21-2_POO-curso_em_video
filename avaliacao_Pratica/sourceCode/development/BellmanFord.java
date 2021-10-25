import java.util.List;

public class BellmanFord {
    private List<Vertex> vertexList;
    private List<Edge> edgeList;

    public BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public void shotestPath(Vertex sourceVertex, Vertex targetVertex) {
        sourceVertex.setMinDistance(0);

        int length = this.vertexList.size();

        for (int i = 0; i < length - 1; i++) {
            for (Edge edge : this.edgeList) {

                if (edge.getStartVertex().getMinDistance() == Double.MAX_VALUE) {
                    continue;
                }

                Vertex v = edge.getStartVertex();
                Vertex u = edge.getTargetVertex();

                double newDistance = v.getMinDistance() + edge.getWeight();

                if (newDistance < u.getMinDistance()) {
                    u.setMinDistance(newDistance);
                    u.setPreviousVertex(v);
                }
            }
        }

        for (Edge edge : this.edgeList) {
            if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
                if (hasCycle(edge)) {
                    System.out.println("There is a negative cycle...");
                }
            }
        }

        if (targetVertex.getMinDistance() == Double.MAX_VALUE) {
            System.out.println("There is no path at all to target from source...");
        } else {
            System.out.println("Shortest path is: " + targetVertex.getMinDistance());
        }

    }

    private boolean hasCycle(Edge edge) {
        return (edge.getStartVertex().getMinDistance() + edge.getWeight()) < edge.getTargetVertex().getMinDistance();
    }
}
