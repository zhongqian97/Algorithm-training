class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int N = costs.length;
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += costs[i][0];
        }
        Arrays.sort(costs, (a, b) -> ((a[1] - a[0]) - (b[1] - b[0])));
        for (int i = 0; i < N / 2; i++) {
            total += (costs[i][1] - costs[i][0]);
        }
        return total;
    }
}
