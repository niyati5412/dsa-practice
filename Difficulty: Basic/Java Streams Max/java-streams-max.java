class Solution {
    public static int maxUsingStreams(int[] arr) {
        // code here
    return Arrays.stream(arr).max().getAsInt();
    }
}