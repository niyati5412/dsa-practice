/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, 0, path, result);

        return result;
    }

    private void dfs(TreeNode node, int targetSum, int sum,
                     List<Integer> path,
                     List<List<Integer>> result) {

        if (node == null) {
            return;
        }

        // Add current node
        path.add(node.val);
        sum += node.val;

        // Check leaf node
        if (node.left == null && node.right == null) {

            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
        }

        // Explore left subtree
        dfs(node.left, targetSum, sum, path, result);

        // Explore right subtree
        dfs(node.right, targetSum, sum, path, result);

        // Backtracking
        path.remove(path.size() - 1);
    }
}