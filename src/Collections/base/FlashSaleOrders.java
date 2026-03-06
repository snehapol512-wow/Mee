package Collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIds = new ArrayList<>();
        orderIds.add(5);
        orderIds.add(6);
        orderIds.add(7);
        System.out.println("Orders Received : "  +  orderIds);
        System.out.println("Number of orders : " +  orderIds.size());

    }
}
