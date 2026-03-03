package Assignment2;

public class SbSb {
    public static void main(String[] args){
        String s = "Hello"; s += " World";          // creates new object
        StringBuilder sb = new StringBuilder("Hello"); sb.append(" World");  // mutable, not thread-safe
        StringBuffer sbf = new StringBuffer("Hello"); sbf.append(" World"); // mutable, thread-safe
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
}
