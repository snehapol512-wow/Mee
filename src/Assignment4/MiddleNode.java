package Assignment4;
    class Node1 {
        int data;
        Node1 next;

        Node1(int d) {
            data = d;
        }
    }

    public class MiddleNode {

        public static void main(String[] args) {

            Node1 head = new Node1(1);
            head.next = new Node1(2);
            head.next.next = new Node1(3);
            head.next.next.next = new Node1(4);
            head.next.next.next.next = new Node1(5);

            Node1 slow = head;
            Node1 fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println("Middle Node: " + slow.data);
        }
    }

