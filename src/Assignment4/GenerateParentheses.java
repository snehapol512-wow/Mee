package Assignment4;
public class GenerateParentheses {
        static void generate(String s, int open, int close, int n) {

            if (s.length() == n * 2) {
                System.out.println(s);
                return;
            }

            if (open < n)
                generate(s + "(", open + 1, close, n);

            if (close < open)
                generate(s + ")", open, close + 1, n);
        }

        public static void main(String[] args) {
            generate("", 0, 0, 3);
        }
    }
