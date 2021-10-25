import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // --------------------->>>>Dijkstra<<<<<<<<<------------------------------------------

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");

        v1.addNeighbour(new Edge(2, v1, v2));

        v1.addNeighbour(new Edge(10, v1, v2));

        v1.addNeighbour(new Edge(1, v1, v3));
        v1.addNeighbour(new Edge(100, v1, v4));

        v4.addNeighbour(new Edge(1, v4, v3));

        v3.addNeighbour(new Edge(1, v3, v4));
        v2.addNeighbour(new Edge(1, v2, v3));
        v2.addNeighbour(new Edge(1, v2, v4));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v4));
        // --------------------->>>>BellmanFord<<<<<<<<<------------------------------------------
        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex("A"));
        vertexList.add(new Vertex("B"));
        vertexList.add(new Vertex("C"));
        vertexList.add(new Vertex("D"));

        List<Edge> edgeList = new ArrayList<>();

        edgeList.add(new Edge(1, vertexList.get(0), vertexList.get(1)));
        edgeList.add(new Edge(1, vertexList.get(1), vertexList.get(2)));
        edgeList.add(new Edge(1, vertexList.get(2), vertexList.get(3)));
        // edgeList.add(new Edge(-5, vertexList.get(3), vertexList.get(1))); // negative
        // case
        edgeList.add(new Edge(10, vertexList.get(0), vertexList.get(3)));

        BellmanFord algorithm = new BellmanFord(edgeList, vertexList);
        algorithm.shotestPath(vertexList.get(0), vertexList.get(3));
    }
}
