package graph;

import java.util.*;

public class CityGraph {

    private Map<String, List<Node>> adjList = new HashMap<>();

    public void addLocation(String city) {
        adjList.putIfAbsent(city, new ArrayList<>());
    }

    public void addRoad(String from, String to, int distance) {

        adjList.get(from).add(new Node(to, distance));
        adjList.get(to).add(new Node(from, distance));
    }

    public int shortestPath(String source, String destination) {

        Map<String, Integer> dist = new HashMap<>();

        PriorityQueue<Node> pq =
                new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));

        for (String city : adjList.keySet()) {
            dist.put(city, Integer.MAX_VALUE);
        }

        dist.put(source, 0);
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            for (Node neighbor : adjList.get(current.city)) {

                int newDist = dist.get(current.city) + neighbor.distance;

                if (newDist < dist.get(neighbor.city)) {
                    dist.put(neighbor.city, newDist);
                    pq.add(new Node(neighbor.city, newDist));
                }
            }
        }

        return dist.get(destination);
    }
}