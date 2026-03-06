package Collections.base.sets;
import java.util.HashSet;
import java.util.Set;
public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("diya@gmail.com");
        emailQueue.add("achu@gamil.com");
        emailQueue.add("dora@gmail.com");
        emailQueue.add("dora@gmail.com");
        emailQueue.add("boots@gmail.com");
        emailQueue.add("chimpu@gmail.com");
        System.out.println("Email to send : " + emailQueue );
        System.out.println("Unique Email : " + emailQueue.size());
    }
}
