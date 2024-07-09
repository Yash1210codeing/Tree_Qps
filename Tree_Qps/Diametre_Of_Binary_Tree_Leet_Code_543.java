package Tree_Qps;
public class Diametre_Of_Binary_Tree_Leet_Code_543 {
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
    		if(root==null) {
    			return 0;
    		}
    		int ld=diameterOfBinaryTree(root.left);
    		int rd=diameterOfBinaryTree(root.right);
    		int sd=ht(root.left)+ht(root.right)+2;
    		return Math.max(rd, Math.max(rd, sd));
    	}
    	public int ht(TreeNode root) {
    		if(root==null) {
    			return-1;
    		}
    		int lh=ht(root.left);
    		int rh=ht(root.right);
    		return Math.max(lh, rh)+1;
    	}
    }
}