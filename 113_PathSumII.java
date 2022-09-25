/*
113. Path Sum II
Medium

Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. 
Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: []
Example 3:

Input: root = [1,2], targetSum = 0
Output: []
*/

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
        Stack<Integer> stackInt = new Stack<>();
        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode, TreeNode> path = new HashMap<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        stack.push(root);
        stackInt.push(root.val);
        path.put(root, null);
        
        while(stack.size() > 0){
            int currentSum = stackInt.pop();
            TreeNode currentNode = stack.pop();
            
            if(currentSum == targetSum && currentNode.left == null && currentNode.right == null){
                ArrayList<Integer> r = new ArrayList<>();
                TreeNode temp = currentNode;
                while(temp != null){
                    r.add(0, temp.val);
                    temp = path.get(temp);
                }
                
                result.add(r);
            }
            
            if(currentNode.left != null){
                stack.add(currentNode.left);
                path.put(currentNode.left, currentNode);
                stackInt.add(currentSum + currentNode.left.val);
            }

            if(currentNode.right != null){
                stack.add(currentNode.right);
                path.put(currentNode.right, currentNode);
                stackInt.add(currentSum + currentNode.right.val);
            }
        
        }
        
        return result;
    }
}
