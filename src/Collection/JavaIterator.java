package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(30);
        list.add(4);
        list.add(5);
        list.add(12);
        list.add(19);
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        // Remove the elements which are greater than 10
        while (it.hasNext()){
        Integer i = it.next();
        if (i%2 != 0) {
            it.remove();
        }
    }

        System.out.println(list);
    }
}
