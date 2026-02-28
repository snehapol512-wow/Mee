package strings;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);//Checks values
        String s3 = new String("Java");
        System.out.println(s1 == s3);//Checks references /objects
        System.out.println(s1.equals(s3));

    }
}
