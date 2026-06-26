class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] isPrime = new int[right + 1];
        Arrays.fill(isPrime, 1);
         isPrime[0] = 0;
         isPrime[1] = 0;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]==1) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = 0;
                }
            }
        }
        int prev = -1;
        int minGap = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        for (int i = left; i <= right; i++) {
              if (isPrime[i]==1) {
                 if (prev != -1) {
                    if (i - prev < minGap) {
                        minGap = i - prev;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
}