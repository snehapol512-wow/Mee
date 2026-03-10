package Collection;
import InnerClass.IntegerRanges;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Dora");
        ht.put(117,"Boots");
        ht.put(128,"Tom");
        ht.put(100,"Jerry");
        ht.put(99,"Oggy");
        ht.put(101,"Olivia");
        ht.put(null,"Bob "); //No null keys allowed in HashTable, null values are allowed
        for(Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
        ht.remove(95);
        System.out.println(ht);
    }}
