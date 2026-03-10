package Collection;
import java.util.Map;
import java.util.LinkedHashMap;
public class ApiLogs {
    public static void main(String[] args) {
        Map<String, String> logs = new LinkedHashMap<>();
        // LinkedHashMap To maintain the insertion order, no matter the key.
        logs.put("2", "Sign Up");
        logs.put("3", "Login");
        logs.put("4", "Browse videos");
        logs.put("1", "Scroll up and down");
        logs.put("5", "Log Out");
        System.out.println("API logs : " + logs);

    }
}
