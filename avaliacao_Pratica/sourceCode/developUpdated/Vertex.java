import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
    private String name;
    private boolean visited;
    private List<Edge> edges;
    private double minDistance = Double.MAX_VALUE;
    private Vertex previousVertex;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    /// drikstra
    public void addNeighbour(Edge edge) {
        this.edges.add(edge);
    }

    ///
    public void addAdge(Edge edge) {
        this.edges.add(edge);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    // if (age < 21) {
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.minDistance);
    }
}
