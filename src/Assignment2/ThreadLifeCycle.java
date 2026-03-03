package Assignment2;

public class ThreadLifeCycle extends Thread {

        public void run() {
            System.out.println("Running");
        }

        public static void main(String[] args) {
            ThreadLifeCycle t = new ThreadLifeCycle();

            System.out.println(t.getState());
            t.start();
            System.out.println(t.getState());
        }
    }

