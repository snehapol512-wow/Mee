package Arrays.Problems.Algos;

public class Kadane {
    static int kadane(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for(int i=1; i<arr.length; i++) {
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
        }

    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println(kadane(arr));
        int[] array = {-2,0,-1,-10,-9,-5};
        System.out.println(kadane(array));
    }
    }

