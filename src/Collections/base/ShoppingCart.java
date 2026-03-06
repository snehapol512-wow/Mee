package Collections.base;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Kurti");
        cart.add("Jhumka");
        cart.add("Bangles");
        cart.remove("Bangles"); // removes the item
        cart.set(1,"Watch");
        System.out.println("Cart items : " + cart);
        System.out.println("Total items : " + cart.size());

    }
}
