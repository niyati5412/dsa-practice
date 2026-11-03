class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> lt = new ArrayList<>();
        int n = arr.length;
        int prefix[]= new int[n];
        
        prefix[0]=arr[0];
         lt.add(prefix[0]);
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
            lt.add(prefix[i]);
        }
        
       return lt;
    }
}