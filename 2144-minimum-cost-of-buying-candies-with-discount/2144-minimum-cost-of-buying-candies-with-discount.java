import java.util.*;

class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int total = 0;
        int count = 0;

        for (int i = cost.length - 1; i >= 0; i--) {

            if (count == 2) {
                count = 0;
            } else {
                total += cost[i];
                count++;
            }
        }

        return total;
    }
}