class Solution {

    private long power(int base, int exp, int limit) {
        long ans = 1;

        for (int i = 0; i < exp; i++) {
            ans *= base;

            if (ans > limit)
                return ans;
        }

        return ans;
    }

public int nthRoot(int n, int m) {

    if(m == 0)
        return 0;

    int low = 1;
    int high = m;

    while(low <= high){

        int mid = low + (high-low)/2;

        long value = power(mid,n,m);

        if(value == m)
            return mid;

        else if(value < m)
            low = mid+1;

        else
            high = mid-1;
    }

    return -1;

    }
}