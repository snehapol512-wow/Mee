package Linear;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null; // We do not know the address of the next node.
            size++; // Increment the size as soon as the node is created
        }

        public void ne() {
        }
    }
    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +  " -> ");
            curr = curr.next;
        }
        System.out.print( " null ");
    }
    public void addFirst(String data) {
        // Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        // Create a new node
        Node newNode = new Node(data);
        // empty list
        if(head==null) {
            head = newNode;
            return;
        }
        // If there are multiple nodes we need to find the last node
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        // At the end of this loop, we will stand at the last node
        // Point the last node next pointer to the new node
        last.next = newNode;
    }
    public void removeFirst() {
        // Empty list -> cannot remove the head node.
        if(head == null){
            System.out.println("List is empty. Can't delete the head");
            return;
        }
        // For a single node, the head will point to the next(null)
        // For multiple nodes, the head will point to the next(head.next)
        head = this.head.next;
    }
    public void removeLast() {
        // Empty list -> cannot remove the tail node.
        if(head == null) {
            System.out.println("List is empty. Can't delete the tail");
            return;
        }
        //Single Element in the List
        if(head.next == null){
            head = null; // C or C++ style of code
            return;
        }
//Multiple elements in the list
    Node curr = head;
    Node last = head.next;
    while(last.next != null){
        curr = last;
        last = last.next;
    }
    curr.next = null;
    size --;
    }
    // The  last node will be cleared by the JVM if not used
    // So, we point the secondLast (curr) node to null pointer

    public void removeTarget(String target) {
        // Empty
        if(head == null){
            System.out.println("List is empty. Can't delete the target");
            return;
        }
        // Case 1 : target is the head node itself
    if(head.data.equals(target)){
        head = head.next;
        size--;
        return;
    }
    // Case 2 : target is the anywhere in the list
        Node prev = null;
    Node curr = head;
    while (curr != null && !curr.data.equals(target)){
        prev = curr;
        curr = curr.next;
    }
    //Do a check to see if the curr pointer is null
        // if null, the target is not found
        if(curr == null){
            System.out.println("Target not found in the list!");
            return;
        }
        prev.next = curr.next;//Adjust the previous node & current node
        size--;
    }
public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("DSA");
        sll.addFirst("learning");
        sll.addFirst("are");
        sll.addFirst("We");
        sll.printList();
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
        sll.removeFirst();
        sll.removeLast();
        sll.removeTarget("learning");
        sll.printList();
        sll.removeTarget("Python");


    }
    }

