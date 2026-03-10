package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(30);
        list.add(4);
        list.add(5);
        list.add(12);
        list.add(19);
        System.out.println("Before : " + list );
        list.removeIf(n -> n%2 == 0);
        System.out.println("After : " + list);
    }
}
