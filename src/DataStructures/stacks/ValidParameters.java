package DataStructures.stacks;
import java.util.Stack;
public class ValidParameters {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { // {,(,[,],),}
            if (c == '(' || c == '[' || c == '{') {
                // Push opening braces onto the stack
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.empty(); //String is a valid Parentheses if all the characters are removed
        //else it is invalid if there are some mismatched characters
    }
public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{)}](]";
    System.out.println(s1 + "  " + (isValid(s1) ? "Valid" : "Invalid"));
    System.out.println(s2 + "  " + (isValid(s2) ? "Valid" : "Invalid"));

}

}
