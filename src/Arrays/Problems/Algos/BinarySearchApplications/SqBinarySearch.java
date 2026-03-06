package Arrays.Problems.Algos.BinarySearchApplications;

public class SqBinarySearch {
    public static int sqrt_bs(int n) {
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int square = mid * mid;
            if (square == n) {
                return mid;
            } else if (square > n) {
                e = mid - 1; // go to the left if the value is greater
            } else {
                // Store the probable answer and move to the right
                ans = mid; // The mid is stored in the answer
                s = mid + 1;//WE move to the right to find the answer after storing it, if the value is smaller
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt_bs(25));
        System.out.println(sqrt_bs(69));
    }
}

