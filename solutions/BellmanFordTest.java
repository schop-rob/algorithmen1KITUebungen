package solutions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GraphSolution{
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
  public GraphSolution(List<Edge>  e, int n) {
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
    int[] distances = new int[vertexNumber];
    //Initialize all distances to infinite (or close to infinite anyways)
    for(int i = 0; i < vertexNumber; i++) {
      distances[i] = Integer.MAX_VALUE;
    }
    distances[start] = 0;

    //relax all edges n-1 times
    for (int i = 0; i < vertexNumber -1; i++) {
      for(Edge b : edges) {
        if (distances[b.source] + b.weight < distances[b.destination]) {
          distances[b.destination] = distances[b.source] + b.weight;
        }
      }
    }

    //check negative weights
    for(Edge e : edges) {
      if (distances[e.source] + e.weight < distances[e.destination]) {
        return "Negative cycle lol";
      }
    }
    return "The shortest path from " + start + " to " + target + " is: " + distances[target];
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
    GraphSolution g = new GraphSolution(list, 5);
    //should output 1
    System.out.println(g.calculateDistanceBellmanFord(0,4));
  }
}