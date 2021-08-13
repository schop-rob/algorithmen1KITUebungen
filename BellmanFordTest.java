import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Graph{
  private static class Edge{
    int weight;
    int source;
    int destination;
    public Edge(int s, int d, int w) {
      source = s;
      destination = d;
      weight = w;
    }
  }
  ArrayList<Edge> edges = new ArrayList<>();
  int vertexNumber;
  //n is the number of vertices
  public Graph(List<Edge>  e, int n) {
    this.edges.addAll(e);
    vertexNumber = n;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    for(Edge e : edges) {
      s.append("From " + e.source + " to " + e.destination + " costing " + e.weight + "\n");
    }
    return s.toString();
  }

  //Berechne die Länge des kürzesten Wegs, indem du Bellman-Ford anwendest
  public String calculateDistanceBellmanFord(int start, int target) {
    return "Lösung";
  }

  public static void main(String[] args) {
    List<Edge> list = new ArrayList<>();
    list.add(new Edge(0,1, -1));
    list.add(new Edge(1,2,3));
    list.add(new Edge(0,2,4));
    list.add(new Edge(1,3,2));
    list.add(new Edge(3,1,1));
    list.add(new Edge(1,4,2));
    list.add(new Edge(3,2,5));
    list.add(new Edge(4,3,-3));
    Graph g = new Graph(list, 5);
    //should output 1
    System.out.println(g.calculateDistanceBellmanFord(0,4));
  }
}