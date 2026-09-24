class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(int[] nums, int start,
                   List<Integer> temp,
                   List<List<Integer>> ans) {

        if (temp.size() >= 2) {
            ans.add(new ArrayList<>(temp));
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = start; i < nums.length; i++) {

            // decreasing
            if (!temp.isEmpty() && nums[i] < temp.get(temp.size() - 1)) {
                continue;
            }

            // duplicate at SAME LEVEL
            if (set.contains(nums[i])) {
                continue;
            }

            set.add(nums[i]);

            temp.add(nums[i]);

            backtrack(nums, i + 1, temp, ans);

            temp.remove(temp.size() - 1);
        }
    }
}