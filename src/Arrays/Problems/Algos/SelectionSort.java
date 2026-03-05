package Arrays.Problems.Algos;

import java.util.Arrays;

public class SelectionSort {
    public  static void selectionSort(int[] arr) {
        for(int i =0; i<arr.length-1;i++){ // (n-1) iterations
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex !=i){ // What we took as min index is wrong, so swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

public static void main(String[] args) {
        int[] arr = {5,3,1,2,0};
        int[] array = {8,2,1,9,0};
    System.out.println(Arrays.toString(arr));
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(array));
    selectionSort(array);
    System.out.println(Arrays.toString(array));

}

}