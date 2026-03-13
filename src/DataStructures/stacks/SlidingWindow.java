package DataStructures.stacks;
public class SlidingWindow {
    public static void main(String[] args) {
        // Total windows
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        for(int i=0;i<arr.length-k;i++){
            int max = arr[i];
            for(int j=1;j<i+k;j++){
                if(arr[j] > max){
                    max=arr[j];
                }
            }
            System.out.println(max + "  ");
        }
    }
}
