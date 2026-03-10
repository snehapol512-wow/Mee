package Collection.lambdaExpressions;
public class Ex1 {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Thread is running using Lamda(->)");
        };
        Thread t = new Thread(r);
        t.start();
        }
    }

