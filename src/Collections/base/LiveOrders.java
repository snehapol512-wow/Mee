package Collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        // new orders are added
        liveOrders.add("Plants");
        liveOrders.add("Accessories");
        liveOrders.add("Jeans");
        //Check orders
        System.out.println("Jeans exists?" +  liveOrders.contains("Jeans"));
        // Check the live orders
        System.out.println("Live Orders : " + liveOrders);
        liveOrders.clear();
        System.out.println("Orders after closing : " + liveOrders);
        liveOrders.remove("Accessories");
    }
}
