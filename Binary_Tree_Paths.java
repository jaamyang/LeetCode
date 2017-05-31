import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
	public List<String> Solution(TreeNode root){
		List<String> path = new ArrayList<String>();
		if(root==null) return path;
		StringBuffer fsb = new StringBuffer();
		findpath(path,root,fsb);
		return path;
	}
	public void findpath(List<String> tpath,TreeNode r,StringBuffer st){
		if(r==null) {
			String s = st.toString();
			tpath.add(s);
			return ;
		}
		st.append(r.val);
		if(r.left==null&&r.right==null){
			String s = st.toString();
			tpath.add(s);
			return ;
		}
		if(r.left!=null&&r.right!=null)
		{
			StringBuffer sb = new StringBuffer();
			st.append("->");
			sb.append(st);
			findpath(tpath,r.right,sb);
			findpath(tpath,r.left,st);
		}
		else if(r.left==null) findpath(tpath,r.right,st.append("->"));
		else findpath(tpath,r.left,st.append("->"));
	}
	
	public static void main(String[] args){
		Binary_Tree_Paths btp = new Binary_Tree_Paths();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		//root.right.right = new TreeNode(7);
		List l=btp.Solution(root);
		//l.add("asdsdas");
		System.out.println(l);
	}
}
