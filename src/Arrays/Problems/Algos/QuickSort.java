package Arrays.Problems.Algos;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partitionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count = 0;
        for(int i=s+1; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        // Place the pivot at the correct position of the index
        int partitionIndex = s+count;
        swap(arr, partitionIndex,s);
        //Let's manage the left and right of the pivot
        int i = s, j =e;
        while(i<partitionIndex && j>partitionIndex){
            while (arr[i] < pivot) { // If left side is smaller, move to next
                i++;
            }
            while(arr[j] > pivot){ // If right side is greater, move to next
                j--;
            }
            if(i<partitionIndex && j>partitionIndex){
                swap(arr, i++, j--);
            }
        }
        return partitionIndex;
    }
    public static void quickSort(int[] arr, int s, int e){
        //base case // If single element out of bounds
        if(s>=e) {
            return;
        }
        // Find the pivot for partition of the array
        int p = partitionIndex(arr, s, e);
        //Now we use recursion to sort the LHS and RHS
        // Left part
        quickSort(arr,s,p-1);
        // Right part
        quickSort(arr,p+1,e);
        }

    public static void main(String[] args) {
        int[] arr = {5,1,8,7,9,0};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));


    }
    }

