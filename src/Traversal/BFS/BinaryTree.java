package Traversal.BFS;
import java.util.Queue;
import java.util.LinkedList;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null; //Initially the node has no children
    }
}
public class BinaryTree {
        public static void levelOrderTraversalOrBFS(TreeNode root) {
            //Base case // Corner case //Edge case
            if (root == null) {
                return;
            }
            //You are pushing nodes into the queue not integers
            Queue<TreeNode> queue = new LinkedList<>();
            //Add the root node into the queue & then traverse from left to right
            queue.add(root);
            //Print all nodes level by level til, the queue is empty
            while (!queue.isEmpty()) {
                TreeNode temp = queue.poll(); //removes and stores the front node
                System.out.print(temp.data + "  ");
                //left subtree
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                //right subtree
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            System.out.println();
        }
    public static void main(String[] args) {
        //L0
        TreeNode root = new TreeNode(1);
        //L1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //L2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("BFS or Level Order Traversal : ");
       levelOrderTraversalOrBFS(root);

    }

}
