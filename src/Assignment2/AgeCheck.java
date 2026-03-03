package Assignment2;

public class AgeCheck {
    public static void main(String[] args) {

        int age = 16;

        try {
            if (age < 18) {
                throw new Exception("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

