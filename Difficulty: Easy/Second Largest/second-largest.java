class Solution {
    public int getSecondLargest(int[] arr) {
        int max=arr[0];
        int secmax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>secmax){
                secmax=arr[i];
            }
        }
            return secmax;
    }
}