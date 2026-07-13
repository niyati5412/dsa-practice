class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Remaining windows
        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}