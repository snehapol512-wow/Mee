package Collection;
import java.util.Map;
import java.util.HashMap;
public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("Admin", "admin123@gmail.com");
        users.put("User 1", "pass1");
        users.put("User 2", "pass2");
        users.put("Admin", "admin512@mail.com");//Update the password
        System.out.println("Admin password : " + users.get("Admin"));
    }
}
