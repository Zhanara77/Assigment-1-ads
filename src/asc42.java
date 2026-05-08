import java.util.*;

public class asc42 {

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

        dfs(graph, "A");

        bfs(graph, "A");
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

    // DFS
    static void dfs(
            HashMap<String,
                    ArrayList<Edge>> graph,
            String start) {

        HashSet<String> visited =
                new HashSet<>();

        System.out.print(
                "DFS: ");

        dfsHelper(graph,
                start,
                visited);

        System.out.println();
    }

    static void dfsHelper(
            HashMap<String,
                    ArrayList<Edge>> graph,
            String current,
            HashSet<String> visited) {

        visited.add(current);

        System.out.print(current + " ");

        for (Edge e :
                graph.get(current)) {

            if (!visited.contains(e.to)) {

                dfsHelper(graph,
                        e.to,
                        visited);
            }
        }
    }

    // BFS
    static void bfs(
            HashMap<String,
                    ArrayList<Edge>> graph,
            String start) {

        HashSet<String> visited =
                new HashSet<>();

        Queue<String> q =
                new LinkedList<>();

        visited.add(start);

        q.add(start);

        System.out.print(
                "BFS: ");

        while (!q.isEmpty()) {

            String current =
                    q.poll();

            System.out.print(
                    current + " ");

            for (Edge e :
                    graph.get(current)) {

                if (!visited.contains(e.to)) {

                    visited.add(e.to);

                    q.add(e.to);
                }
            }
        }

        System.out.println();
    }
}