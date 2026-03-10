package Collection.lambdaExpressions;
import java.util.ArrayList;
// JAVA STREAM API - JAVA 8 (::) -> STREAMS (->) Lambda
public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println);//STREAM API JAVA 8
        list.forEach(n -> System.out.println(n));//Lambda
    }
}
