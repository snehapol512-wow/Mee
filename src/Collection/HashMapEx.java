package Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("1", "dora");
        hashmap.put("3", "boots");
        hashmap.put("4", "oggy");
        hashmap.put("2", "jack");
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
        Map<String, String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put("1", "dora");
        hashmap1.put("3", "boots");
        hashmap1.put("4", "oggy");
        hashmap1.put("2", "jack");
        for (Map.Entry<String, String> entry : hashmap1.entrySet()) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }
    }
}
