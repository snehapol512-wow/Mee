package Assignment4;
import java.util.*;

    public class CombinationSum {

        static void find(int[] arr,int target,List<Integer> cur,int index){

            if(target==0){
                System.out.println(cur);
                return;
            }

            for(int i=index;i<arr.length;i++){
                if(arr[i]<=target){
                    cur.add(arr[i]);
                    find(arr,target-arr[i],cur,i);
                    cur.remove(cur.size()-1);
                }
            }
        }

        public static void main(String[] args){
            int[] arr={2,3,6,7};
            find(arr,7,new ArrayList<>(),0);
        }
    }

