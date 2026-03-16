package Assignment4;
import java.util.*;

    public class Subsets {
        static void find(int[] nums, int index, List<Integer> cur){
            System.out.println(cur);

            for(int i=index;i<nums.length;i++){
                cur.add(nums[i]);
                find(nums,i+1,cur);
                cur.remove(cur.size()-1);
            }
        }

        public static void main(String[] args){
            int[] nums={1,2,3};
            find(nums,0,new ArrayList<>());
        }
    }

