class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();

        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        visited[0] = true;
        q.add(0);

        while (!q.isEmpty()) {

            int node = q.poll();

            ans.add(node);

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    q.add(neighbour);
                }
            }
        }

        return ans;
    }
}