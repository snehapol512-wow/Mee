package Assignment3;

public class BinarySearchRecursive {
        static int search(int[] arr,int left,int right,int target)
        {
            if(left>right)
                return -1;

            int mid = (left+right)/2;

            if(arr[mid]==target)
                return mid;

            if(arr[mid] > target)
                return search(arr,left,mid-1,target);

            return search(arr,mid+1,right,target);
        }

        public static void main(String[] args) {

            int[] arr = {1,3,5,7,9};

            int result = search(arr,0,arr.length-1,7);

            System.out.println("Index = "+result);
        }
    }
