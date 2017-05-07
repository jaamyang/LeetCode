
public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null != p && null != q){
            if(p.val != q.val) return false;
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        if((null == p&& null !=q)||(null != p&& null ==q)) return false;
        return true;
    }
	public static void main(String[] args){
		TreeNode p = null ;//new TreeNode(1);
		TreeNode q = null ;//new TreeNode(1);
		//TreeNode q = null;
		//q.left = new TreeNode(2);
		//p.left = new TreeNode(2);
		//q.right = new TreeNode(1);
		//p.right = new TreeNode(2);
		System.out.println(new Same_Tree().isSameTree(p, q));
 	}
}
