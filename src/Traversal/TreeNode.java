package Traversal;
public class TreeNode {
    int data; // The data of the node
    TreeNode left; // The reference to the left child
    TreeNode right; //The reference to the right child
    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null; //Initially the node has no children
    }
    public static void preOrder(TreeNode root) { //DLR , Left arrow
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root) { //LDR , Down Arrow
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root) { //LRD , Right arrow
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }
    }


    public static void main(String[] args) {
        //Rule for constructing the binary tree -> always from top to bottom & left to right
    // Level 0
        TreeNode root = new TreeNode(1);
        //Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("PreOrder Traversal : ");
        preOrder(root);
        System.out.println("InOrder Traversal : ");
        inOrder(root);
        System.out.println("PostOrder Traversal : ");
        postOrder(root);

    }

}
