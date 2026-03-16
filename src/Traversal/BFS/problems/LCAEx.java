package Traversal.BFS.problems;
public class LCAEx {
    static class Node{
    int data;
    Node left, right;
    Node (int data){
    this.data = data;
    }
    }
    static Node finalLCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node left = finalLCA(root.left, n1, n2);
        Node right = finalLCA(root.right, n1, n2);
        if(left != null && right != null) {
            return root;
        }
        return (left != null ?  left : right);
        }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        Node lca = finalLCA(root, 4,5);
        System.out.println("LCA : " + lca.data);
    }
    }

