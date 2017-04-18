import java.util.Stack;

public class Maximum_Depth_of_Binary_Tree {
	public static int maxDepth(TreeNode root){
		// DFS 的普通解法
		/*int cdepth = 0;
		int maxdepth = 0;
		int flag = 0;
		TreeNode troot = new TreeNode(1);
		troot.left = root;
		troot.right = null;
		TreeNode temp = troot;
		Stack<TreeNode> tree = new Stack<TreeNode>();
		tree.push(troot);
		while(temp != null&&troot.left != null){
			if(temp.left != null)
				temp = temp.left;
			else if(temp.right != null)
				temp = temp.right;
			else
			{
				maxdepth = maxdepth>cdepth?maxdepth:cdepth;
				TreeNode t=tree.pop();
				temp = tree.peek();
				if(t == temp.left)
					temp.left = null;
				else if(t == temp.right)
					temp.right = null;
				cdepth -= 1;
				continue;
			}
			tree.push(temp);
			cdepth += 1;		
		}
		return maxdepth;*/
		
		// 迭代DFS
		if(root == null)
			return 0;
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	public static void main(String[] args){
		TreeNode s = new TreeNode(1);
		s.left = null;
		s.right = new TreeNode(2);
		System.out.println(maxDepth(s));
	}
}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
}
	
