package Assignment3;

public class DifferenceArray {
        public static void main(String[] args) {

            int n = 5;
            int[] arr = new int[n];
            int[] diff = new int[n];

            diff[1] += 5;
            diff[4] -= 5;

            arr[0] = diff[0];

            for(int i=1;i<n;i++)
            {
                arr[i] = arr[i-1] + diff[i];
            }

            for(int i:arr)
                System.out.print(i+" ");
        }
    }

