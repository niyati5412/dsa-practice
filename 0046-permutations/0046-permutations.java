class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        solve(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    public void solve(int[] nums, boolean[] used,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            current.add(nums[i]);
            used[i] = true;
            solve(nums, used, current, ans);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}