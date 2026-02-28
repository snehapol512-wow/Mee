package strings;

public class MutableStrings {
    public static void main(String[] args) {
        String s = "SNPSU";
        s += "ISE";
        System.out.println("String: " + s);
        StringBuffer buffer = new StringBuffer("SNPSU");
        buffer.append("ISE");
        System.out.println(buffer);
        StringBuilder builder = new StringBuilder("SNPSU");
        builder.append("ISE");
        System.out.println(builder);

    }
}
