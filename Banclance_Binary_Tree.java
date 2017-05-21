
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Banclance_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if(banlance(root)!= -1) return true;
        return false;
    }
    public int banlance(TreeNode root){
        if(root == null) return 0;
        int ld = banlance(root.left);
        if(ld == -1) return -1;
        int rd = banlance(root.right);
        if(rd == -1) return -1;
        if(Math.abs(rd-ld)>1) return -1;
        return Math.max(ld,rd)+1;
    }
    
}