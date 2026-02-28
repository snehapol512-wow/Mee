package exceptions;

public class Demo {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient Funds");
            }else{
                System.out.println("Withdraw successful");
            }
            System.out.println("Withdraw Successful");
        } catch (ArithmeticException e) {
            System.out.println("caught exception:" + e.getMessage());

            }
        }
    }

