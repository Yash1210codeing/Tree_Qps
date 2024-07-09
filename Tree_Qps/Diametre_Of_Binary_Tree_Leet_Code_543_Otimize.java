package Tree_Qps;
import Tree_Qps.Diametre_Of_Binary_Tree_Leet_Code_543.TreeNode;
public class Diametre_Of_Binary_Tree_Leet_Code_543_Otimize {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).dt;
		}
		public Diapair diameter(TreeNode root) {
			if(root==null) {
				return new Diapair();
			}
			Diapair ldp=diameter(root.left);  //(d,h)
			Diapair rdp=diameter(root.right); //(d,h)
			Diapair sdp=new Diapair();
			int sd=ldp.ht+rdp.ht+2;
			sdp.dt=Math.max(sd, Math.max(ldp.dt,rdp.dt));
			sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
			return sdp;
		}	
	class Diapair{
		int dt=0;
		int ht=-1;
	}
	}
}