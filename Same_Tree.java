
public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null != p && null != q){
            if(p.val != q.val) return false;
            if((null == p&& null !=q)||(null != p&& null ==q)) return false;
            isSameTree(p.left,q.left);
            isSameTree(p.right,q.right);
        }
        return true;
    }
	public static void main(String[] args){
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(1);
		/*q.left = new TreeNode(2);
		p.left = new TreeNode(3);*/
		System.out.println(new Same_Tree().isSameTree(p, q));
 	}
}
