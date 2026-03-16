package Assignment4;

public class FirstUniqueChar {
        public static void main(String[] args) {
            String s = "leetcode";

            for (int i = 0; i < s.length(); i++) {
                if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                    System.out.println("Index: " + i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }

