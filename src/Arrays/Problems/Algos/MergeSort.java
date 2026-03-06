package Arrays.Problems.Algos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) { //Sandbox
        int[] array1 = {1, 4, 5, 7, 8};
        int[] array2 = {5, 1, 2};
        int[] merged = mergeSort(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
    public static int[] mergeSort(int[] arr1, int[] arr2){
        // Write your code here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1+n2];
        int i=0, j=0, k=0;
        //Edge case
        while(i<n1 && j<n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        //Check if there are any remaining elements in thw two arrays
        while(i<n1) {
            merged[k++] = arr1[i++];
        }
        while(j<n2) {
            merged[k++] = arr2[j++];
        }
        return merged;


            }
        }
