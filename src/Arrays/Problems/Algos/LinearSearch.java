package Arrays.Problems.Algos;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
                return -1;
            }


    public static void main(String[] args) {
        int[] arr = {10, 20, 67, 86, 512};
        System.out.println(linearSearch(arr, 80));
    }
}

