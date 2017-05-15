/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return recursive(root.left,root.right);
    }
    public boolean recursive(TreeNode nleft,TreeNode nright){
        if(nleft == null&&nright == null)
            return true;
        if(nleft == null && nright != null)
            return false;
        if(nright == null && nleft != null)
            return false;
        if(nright.val!=nleft.val)
            return false;
        return recursive(nleft.left,nright.right)&&recursive(nleft.right,nright.left);
    }
}