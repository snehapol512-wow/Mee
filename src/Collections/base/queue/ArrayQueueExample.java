package Collections.base.queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayQueueExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("Customer orders Biryani");
        actions.addLast("Customer orders Pav Bhaji");
        actions.addLast("Customer orders Pasta");
        System.out.println("Undo : " + actions.removeLast());
        System.out.println("Remaining orders : " + actions);
    }
}
