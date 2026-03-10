package Collection.lambdaExpressions;
interface Add{
    int sum(int a, int b);
}
public class Ex2 {
    public static void main(String[] args) {
        Add add = (int a , int b)->a+b;
        int result = add.sum(10,20);
        System.out.println(result);
    }
}
