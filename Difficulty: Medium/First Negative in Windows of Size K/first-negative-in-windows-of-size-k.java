import java.util.*;

class Solution {
    public List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            // Store index of negative element
            if (arr[right] < 0) {
                q.offer(right);
            }

            // Window size becomes k
            if (right - left + 1 == k) {

                // Remove indices outside current window
                while (!q.isEmpty() && q.peek() < left) {
                    q.poll();
                }

                // First negative
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(arr[q.peek()]);
                }

                // Slide window
                left++;
            }
        }

        return ans;
    }
}