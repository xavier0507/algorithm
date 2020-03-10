package practice.array;

import java.util.Arrays;

/**
 * Created by apple on 2020/3/2.
 */
public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }

        return false;
    }
}
