package Assignment4;
    class Node2 {
        int data;
        Node2 next;

        Node2(int d) {
            data = d;
        }
    }

    public class RemoveNthNode {

        static Node2 remove(Node2 head, int n) {

            Node2 fast = head, slow = head;

            for (int i = 0; i < n; i++)
                fast = fast.next;

            if (fast == null)
                return head.next;

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            return head;
        }

        public static void main(String[] args) {

            Node2 head = new Node2(1);
            head.next = new Node2(2);
            head.next.next = new Node2(3);
            head.next.next.next = new Node2(4);

            head = remove(head, 2);

            Node2 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

