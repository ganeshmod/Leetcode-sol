

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // Create an adjacency list to represent the graph
        Map<Integer, List<Pair<Integer, Double>>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            graph.get(u).add(new Pair<>(v, prob));
            graph.get(v).add(new Pair<>(u, prob));
        }

        // Max-heap to store the current node and the probability to reach it
        PriorityQueue<Pair<Integer, Double>> maxHeap = new PriorityQueue<>(
            (a, b) -> Double.compare(b.getValue(), a.getValue())
        );

        // Start with the start_node with probability 1.0
        maxHeap.add(new Pair<>(start_node, 1.0));

        // Array to keep track of the maximum probability to reach each node
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;

        // Dijkstra's-like algorithm using a max-heap
        while (!maxHeap.isEmpty()) {
            Pair<Integer, Double> current = maxHeap.poll();
            int node = current.getKey();
            double prob = current.getValue();

            // If we reach the end_node, return the probability
            if (node == end_node) {
                return prob;
            }

            // Explore all neighbors of the current node
            for (Pair<Integer, Double> neighbor : graph.get(node)) {
                int nextNode = neighbor.getKey();
                double edgeProb = neighbor.getValue();
                double newProb = prob * edgeProb;

                // If a higher probability path is found, update and add to the heap
                if (newProb > maxProb[nextNode]) {
                    maxProb[nextNode] = newProb;
                    maxHeap.add(new Pair<>(nextNode, newProb));
                }
            }
        }

        // If there's no path from start_node to end_node, return 0.0
        return 0.0;
    }

    // Helper class to store pairs of node and probability
    class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
