import java.util.*;

public class asc43 {

    static class Edge {

        String to;
        int weight;

        Edge(String to, int weight) {

            this.to = to;
            this.weight = weight;
        }
    }

    static class Node {

        String name;
        int dist;

        Node(String name, int dist) {

            this.name = name;
            this.dist = dist;
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

        dijkstra(graph, "D");
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

    static void dijkstra(
            HashMap<String,
                    ArrayList<Edge>> graph,
            String start) {

        HashMap<String, Integer> dist =
                new HashMap<>();

        HashMap<String, String> prev =
                new HashMap<>();

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                a.dist - b.dist
                );

        for (String v :
                graph.keySet()) {

            dist.put(v,
                    Integer.MAX_VALUE);
        }

        dist.put(start, 0);

        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {

            Node now = pq.poll();

            for (Edge e :
                    graph.get(now.name)) {

                int newDist =
                        dist.get(now.name)
                                + e.weight;

                if (newDist <
                        dist.get(e.to)) {

                    dist.put(
                            e.to,
                            newDist
                    );

                    prev.put(
                            e.to,
                            now.name
                    );

                    pq.add(
                            new Node(
                                    e.to,
                                    newDist
                            )
                    );
                }
            }
        }

        System.out.println(
                "Shortest Paths:");

        for (String v :
                dist.keySet()) {

            System.out.print(
                    start + " -> " +
                            v + " = " +
                            dist.get(v) +
                            " | Path: "
            );

            printPath(v, prev);

            System.out.println();
        }
    }

    static void printPath(
            String v,
            HashMap<String,
                    String> prev) {

        ArrayList<String> path =
                new ArrayList<>();

        while (v != null) {

            path.add(v);

            v = prev.get(v);
        }

        Collections.reverse(path);

        for (String s : path) {

            System.out.print(s + " ");
        }
    }
}