package Linear.linkedlist.middleOfLL;
class Nodee{
int data;
Nodee next;
Nodee (int data){
this.data = data;
}
}
public class CycleDetection {
    static Nodee head = null;

    static void createList() {
        head = new Nodee(10);
        head.next = new Nodee(20);
        head.next.next = new Nodee(30);
        head.next.next.next = new Nodee(40);
        //Creating a cycle
        head.next.next.next.next = head.next;// 5th node is connected to the 2nd node
    }

    static boolean hashCycle() {
        Nodee slow = head;
        Nodee fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // move 2 steps
            if (slow == fast) {
                return true; // Detected a cycle
            }
        }
            return false; // NO cycle detected
        }
    public static void main(String[] args) {
        createList();
        if (hashCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("NO cycle has been detected");
        }

    }
}
