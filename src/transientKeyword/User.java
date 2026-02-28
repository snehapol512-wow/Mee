package transientKeyword;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class User implements Serializable {
    String username = "Sneha";
    transient String password = "05124";
}
class TransientDemo {
    public static  void main(String[] args) throws Exception{
        User user = new User();
        ObjectOutputStream oos =new ObjectOutputStream (new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User user2 = (User)ois.readObject();
        System.out.println(user.username);
        System.out.println(user2.username);


    }
}
