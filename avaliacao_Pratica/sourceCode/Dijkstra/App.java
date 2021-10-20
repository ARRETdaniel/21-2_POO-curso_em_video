public class App {
    public static void main(String[] args) {
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
    }
}
