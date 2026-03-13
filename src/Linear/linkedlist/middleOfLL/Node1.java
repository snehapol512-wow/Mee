package Linear.linkedlist.middleOfLL;

import java.util.Scanner;

class EONode{
int data;
EONode next;
EONode (int data){
this.data = data;
}
}
public class Node1 {
    static Node head=null;
    static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void printEven(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                System.out.println(temp.data+" ");
            }
            temp=temp.next;
        }
        System.out.println();

    }
    static void printOdd(){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                System.out.println(temp.data+" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of nodes:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        printEven();
        printOdd();
    }
}
