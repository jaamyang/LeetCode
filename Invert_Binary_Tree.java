
public class Invert_Binary_Tree {
	
	public static void main(String[] args){
		Invert_Binary_Tree invert = new Invert_Binary_Tree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		//root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root = invert.invertTree(root);
		TreeNode.printnode(root);
		//System.out.println(root.val+" "+root.left.val+" "+root.right.val+" ");
	}  
		
	    public TreeNode invertTree(TreeNode root) {
	        return switchtree(root);
	    }
	    public TreeNode switchtree(TreeNode root){
	        if(root == null)
	            return root;
	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        switchtree(root.left);
	        switchtree(root.right);
	        return root;
	    }
	
}
