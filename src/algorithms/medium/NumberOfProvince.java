package algorithms.medium;

public class NumberOfProvince {

    // There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b,
    // and city b is connected directly with city c, then city a is connected indirectly with city c.
    //
    // A province is a group of directly or indirectly connected cities and no other cities outside of the group.
    //
    // You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are
    // directly connected, and isConnected[i][j] = 0 otherwise.
    //
    // Return the total number of provinces.
    //
    // Example 1:
    // Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
    // Output: 2
    //
    // Example 2:
    // Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
    // Output: 3
    public int findCircleNum(int[][] isConnected) {
        // dfs solution
        int[] visited = new int[isConnected.length];
        int circleCount = 0;
        for (int source = 0; source < isConnected.length; source++) {
            if (visited[source] == 0) {
                findConnectedCity(isConnected, visited, source);
                circleCount++;
            }
        }
        return circleCount;
    }

    private void findConnectedCity(int[][] isConnected, int[] visited, int source) {
        for (int target = 0; target < isConnected.length; target++) {
            if (isConnected[source][target] == 1 && visited[target] == 0) {
                visited[target] = 1;
                findConnectedCity(isConnected, visited, target);
            }
        }
    }
}
