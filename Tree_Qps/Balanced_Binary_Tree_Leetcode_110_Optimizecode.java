package Tree_Qps;
import Tree_Qps.Balanced_Binary_Tree_Leetcode_110.TreeNode;
public class Balanced_Binary_Tree_Leetcode_110_Optimizecode {
	public class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(){   		
    	}
    	TreeNode(int val){
    		this.val=val;
    	}
    	TreeNode(int val,TreeNode left,TreeNode right){
    		this.val=val;
    		this.left=left;
    		this.right=right;
    	}   	
	}
	class solution{
		public boolean isBalanced(TreeNode root) {
			return Balanced (root).isbal;
		}
		public Balancepair Balanced(TreeNode root) {
			if(root==null) {
				return new Balancepair();
			}
			Balancepair lbp=Balanced(root.left);
			Balancepair rbp=Balanced (root.right);
			Balancepair sbp=new Balancepair();
			sbp.ht=Math.max(lbp.ht,rbp.ht)+1;	
			boolean sb=Math.abs(lbp.ht-rbp.ht)<=1;
			sbp.isbal=lbp.isbal && rbp.isbal && sb;
			return sbp;
		}
		class Balancepair{
			boolean isbal=true;
			int ht=-1;
		}
	}
}