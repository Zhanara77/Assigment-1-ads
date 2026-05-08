import java.util.*;

    public class asc4 {

        static class Edge {

            String to;
            int weight;

            Edge(String to, int weight) {
                this.to = to;
                this.weight = weight;
            }
        }

        public static void main(String[] args) {

            HashMap<String, ArrayList<Edge>> graph =
                    new HashMap<>();

            addEdge(graph, "B", "A", 1);
            addEdge(graph, "C", "B", 4);
            addEdge(graph, "D", "B", 9);
            addEdge(graph, "E", "A", 14);
            addEdge(graph, "B", "E", 13);

            System.out.println("Adjacency List:");

            for (String v : graph.keySet()) {

                System.out.print(v + " -> ");

                for (Edge e : graph.get(v)) {

                    System.out.print("(" +
                            e.to + ", " +
                            e.weight + ") ");
                }

                System.out.println();
            }
        }

        static void addVertex(
                HashMap<String,
                        ArrayList<Edge>> graph,
                String v) {

            if (!graph.containsKey(v)) {

                graph.put(v,
                        new ArrayList<>());
            }
        }

        static void addEdge(
                HashMap<String,
                        ArrayList<Edge>> graph,
                String v,
                String w,
                int weight) {

            addVertex(graph, v);
            addVertex(graph, w);

            graph.get(v).add(
                    new Edge(w, weight));

            graph.get(w).add(
                    new Edge(v, weight));
        }
    }

