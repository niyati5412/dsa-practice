class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == target){

                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(left + 1);     
                ans.add(right + 1);

                return ans;
            }

            else if(sum < target){
                left++;
            }

            else{
                right--;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);

        return ans;
    }
}