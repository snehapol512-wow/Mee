package Collections.base.queue;
import java.util.LinkedList;
import java.util.Queue;
public class FoodOrders{
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // Fpr adding - add() [Fail][Strict], offer() [Not fail][Not Strict]
        orders.add("Chole Bhature"); //String capacity based
        orders.add("Egg Roll"); // Flexible
        orders.add("Momo");
        orders.offer("Golgappa");
        System.out.println("Orders : " + orders);
        //For removal : remove() -> Strict[Fail] poll() Not Strict[Not fail]
        System.out.println("Serving : " + orders.poll());
        System.out.println("Pending order : " + orders);
        System.out.println(orders.element());
    }
}

