package Assignment4;
import java.util.Stack;

    public class ValidParentheses {

        public static void main(String[] args){

            String s="()[]{}";
            Stack<Character> stack=new Stack<>();

            for(char c:s.toCharArray()){

                if(c=='('||c=='{'||c=='[')
                    stack.push(c);

                else{
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }
                    stack.pop();
                }
            }

            System.out.println(stack.isEmpty());
        }
    }

