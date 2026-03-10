package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
        public static void main(String[] args) {
            Hashtable<Integer, String> ht = new Hashtable<>();
            ht.put(106,"Dora");
            ht.put(117,"Boots");
            ht.put(128,"Tom");
            ht.put(100,"Jerry");
            ht.put(99,"Oggy");
            ht.put(101,"Olivia");
            ht.put(96,"Bob "); //No null keys allowed in HashTable, null values are allowed
            System.out.println(ht.getOrDefault(101, "Not Found"));
            System.out.println(ht.getOrDefault(200, "Not Found"));
            ht.putIfAbsent(104,"Dede");
            System.out.println("Updated Table : " + ht);
            ht.putIfAbsent(107, "Marky");
            System.out.println("Updated Table : " + ht);
        }}


