package Collections.base.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>(); // We use linked hash set to get the o/p in order
        set.add(2);
        set.add(5);
        set.add(0);
        set.add(4);
        set.add(7);
        set.add(9);
        System.out.println(set);

    }
}
