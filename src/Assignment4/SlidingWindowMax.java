package Assignment4;
import java.util.*;

    public class SlidingWindowMax {

        public static void main(String[] args) {

            int[] nums = {1,3,-1,-3,5,3,6,7};
            int k = 3;

            for (int i = 0; i <= nums.length - k; i++) {

                int max = nums[i];

                for (int j = 1; j < k; j++) {
                    if (nums[i + j] > max)
                        max = nums[i + j];
                }

                System.out.print(max + " ");
            }
        }
    }

