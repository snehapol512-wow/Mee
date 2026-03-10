package Collections.base;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base Case
        if(index >= nums.length){
            ans.add(new ArrayList<>(output));//Add a copy of the subset
            return;
        }

        //Exclude Case
        solve(nums, output, index+1, ans);
        //Include Case
        output.add(nums[index]);//Store that value and move to next index
        solve(nums, output,index+1, ans);
        //Backtrack & remove the last answer from the o/p & to go the next
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,5};
        List<List<Integer>> result = solution.subsets(nums);
        for(List<Integer> subset : result){
            System.out.println(subset);
    }


    }
}
