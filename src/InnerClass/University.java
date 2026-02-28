package InnerClass;
public class University {
static class Admission {
    static boolean isEligible(int marks) {
        return marks >= 60;
    }
}

    public static void main(String[] args) {
        boolean result = University.Admission.isEligible(45);
        System.out.println(result);
        boolean result1 = University.Admission.isEligible(65);
        System.out.println(result1);
    }
}
/*
💡PTR💡
📌No University object needed - No heap memory needed
📌Logical grouping of data
📌similar to creating utility helper class
*/
