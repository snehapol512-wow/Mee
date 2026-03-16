package Assignment4;
    import java.util.Stack;
    public class MinStack {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min = new Stack<>();

        void push(int x) {
            stack.push(x);

            if (min.isEmpty() || x <= min.peek())
                min.push(x);
        }

        void pop() {
            if (stack.pop().equals(min.peek()))
                min.pop();
        }

        int getMin() {
            return min.peek();
        }

        public static void main(String[] args) {

            MinStack obj = new MinStack();

            obj.push(5);
            obj.push(2);
            obj.push(10);

            System.out.println("Min: " + obj.getMin());

            obj.pop();

            System.out.println("Min: " + obj.getMin());
        }
    }

