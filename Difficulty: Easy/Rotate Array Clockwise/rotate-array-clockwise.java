class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
          k = k %n;
          int result[]= new int[n];
          for(int i=0;i<n;i++){
              result[(i+k)%n]=arr[i];
          }
          for(int i=0;i<n;i++){
            arr[i]=result[i];
          }
          
        
    }
}