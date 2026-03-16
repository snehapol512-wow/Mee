package Assignment4;
// LeetCode 206 - Reverse Linked List
class Node{
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
    }
}

public class ReverseList {
    public static void main(String[] args){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);

        Node prev=null;
        Node cur=head;

        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        while(prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
}

