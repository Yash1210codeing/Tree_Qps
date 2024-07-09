package Tree_Qps;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Create_Tree_Using_Level_Order {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	TreeNode root;
	Scanner sc = new Scanner(System.in);
	public Create_Tree_Using_Level_Order() {
		root = buildTree();
	}
	private TreeNode buildTree() {
		int item = sc.nextInt();
		TreeNode node = new TreeNode();
		node.val = item;
		root = node;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			TreeNode rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				TreeNode n = new TreeNode();
				n.val = c1;
				rv.left = n;
				q.add(n);
			}
			if (c1 != -1) {
				TreeNode n = new TreeNode();
				n.val = c2;
				rv.right = n;
				q.add(n);
			}
		}
		return root;
	}
	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}
	private void POStOrder(TreeNode node) {
		if(node==null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.println(node.val+" ");
	}
	public static void main(String[] args) {
		Create_Tree_Using_Level_Order cl = new Create_Tree_Using_Level_Order();
		cl.POStOrder();
	}
}