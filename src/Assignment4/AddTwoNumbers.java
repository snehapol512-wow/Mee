package Assignment4;
    class Node3 {
        int val;
        Node3 next;

        Node3(int v) {
            val = v;
        }
    }

    public class AddTwoNumbers {

        static Node3 add(Node3 l1, Node3 l2) {

            Node3 dummy = new Node3(0);
            Node3 cur = dummy;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {

                int sum = carry;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10;

                cur.next = new Node3(sum % 10);
                cur = cur.next;
            }

            return dummy.next;
        }

        public static void main(String[] args) {

            Node3 l1 = new Node3(2);
            l1.next = new Node3(4);
            l1.next.next = new Node3(3);

            Node3 l2 = new Node3(5);
            l2.next = new Node3(6);
            l2.next.next = new Node3(4);

            Node3 result = add(l1, l2);

            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
    }

