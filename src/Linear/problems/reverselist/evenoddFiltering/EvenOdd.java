package Linear.problems.reverselist.evenoddFiltering;
import java.util.Scanner;

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public class EvenOdd {
        static node head=null;
        static void insert(int data){
            node newnode = new node(data);
            if(head == null){
                head=newnode;
                return;
            }
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }
        static void printEven(){
            node temp =head;
            while(temp != null){
                if(temp.data % 2 ==0) {
                    System.out.println(temp.data + " ");
                }
                temp= temp.next;

            }
            System.out.println();
        }

        static void printOdd(){
            node temp = head;
            while(temp != null){
                if(temp.data % 2 !=0) {
                    System.out.println(temp.data + " ");
                }
                temp= temp.next;
            }

            System.out.println();

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of nodes:");
            int n = sc.nextInt();

            for(int i=0;i<n;i++){
                insert(sc.nextInt());
            }
            printEven();
            printOdd();
        }
    }
