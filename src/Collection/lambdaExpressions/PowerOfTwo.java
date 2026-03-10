package Collection.lambdaExpressions;

import java.util.Scanner;

//Bit manipulation
public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n =scanner.nextInt();
        if((n & (n - 1)) == 0) {
            System.out.println(n  + "POWER OF 2");
        }else{
            System.out.println(n  +  "NOT A POWER OF 2");

        }
    }
}
