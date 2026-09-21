import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    static void solve(int[] arr, int target, int index,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Skip duplicate choices at the same level
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            // Since array is sorted
            if (arr[i] > target) {
                break;
            }

            current.add(arr[i]);

            // i + 1 because each element can be used only once
            solve(arr, target - arr[i], i + 1, current, ans);

            current.remove(current.size() - 1);
        }
    }
}