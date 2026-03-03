package Assignment2;

public class ExceptionDemo {
        static void check(int n) throws MyException {
            if(n < 0) throw new MyException("Negative number not allowed!");
        }
        public static void main(String[] args){
            try { check(-1); }
            catch(MyException e){ System.out.println("Caught: " + e.getMessage()); }
        }
    }

