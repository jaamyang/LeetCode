
public class Binary_Tree_Tilt {
	int tilt = 0;
	public int findTilt(TreeNode root) {   
	    cir(root);
	    return tilt;
	}
	public int cir(TreeNode root){
	    if(root == null)	return 0;
	    int left = cir(root.left);
	    int right = cir(root.right);
	    tilt += Math.abs(left - right);
	    return left+right+root.val;
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
