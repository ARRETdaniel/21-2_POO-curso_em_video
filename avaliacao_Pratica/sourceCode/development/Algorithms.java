import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithms {
  // BellmanFord
  private List<Vertex> vertexList;
  private List<Edge> edgeList;

  public void BellmanFord(List<Edge> edgeList, List<Vertex> vertexList) {
    this.vertexList = vertexList;
    this.edgeList = edgeList;
  }

  // BellmanFord
  // drikstra
  public List<Vertex> getShortestPathTo(Vertex targetVerte) {
    List<Vertex> path = new ArrayList<>();

    for (Vertex vertex = targetVerte; vertex != null; vertex = vertex.getPreviousVertex()) {
      path.add(vertex);
    }

    Collections.reverse(path);
    return path;
  }

  public void Dijkstra(Vertex sourceVertex) {
    // computePath
    sourceVertex.setMinDistance(0);
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(sourceVertex);

    while (!priorityQueue.isEmpty()) {
      Vertex vertex = priorityQueue.poll();

      for (Edge edge : vertex.getEdges()) {
        Vertex v = edge.getTargetVertex();
        // Vertex u = edge.getStartVertex();
        double weight = edge.getWeight();
        double minDistance = vertex.getMinDistance() + weight;

        if (minDistance < v.getMinDistance()) {
          priorityQueue.remove(vertex);
          v.setPreviousVertex(vertex);
          v.setMinDistance(minDistance);
          priorityQueue.add(v);
        }
      }
    }
  }

  // drikstra
  // BellmanFord
  public void getShortestPathTo(Vertex sourceVertex, Vertex targetVertex) {
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

  protected boolean hasCycle(Edge edge) {
    return (edge.getStartVertex().getMinDistance() + edge.getWeight()) < edge.getTargetVertex().getMinDistance();
  }
}
