class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n =arr.length;
        int lb = n;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
             if(arr[mid]>=target){
                 lb= Math.min(lb,mid);
                 hi=mid-1;
             }
             else{
                 lo=mid+1;
             }
        }
        return lb;
    }
}
