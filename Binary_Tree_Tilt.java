
public class Binary_Tree_Tilt {
	public int findTilt(TreeNode root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null )
			return 0;
		if(root.left == null)
			return root.right.val;
		if(root.right == null)
			return root.left.val;
		return Math.abs(root.left.val-root.right.val)+findTilt(root.left)+findTilt(root.right); 
    }
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		//root.left.right = new TreeNode(5);
		//root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(new Binary_Tree_Tilt().findTilt(root));
	}
}
