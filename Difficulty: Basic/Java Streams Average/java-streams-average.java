class Solution {
    public static double avgUsingStreams(int[] arr) {
        // code here
        return Arrays.stream(arr).average().orElse(0.0);
    }
}