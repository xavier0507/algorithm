package practice.array;

import java.util.Arrays;

/**
 * Created by apple on 2020/3/2.
 */
public class MissingNumber268 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        } else if (nums[0] != 0) {
            return 0;
        }

        int missingNumber = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                missingNumber = nums[i + 1] - 1;
            }
        }

        return missingNumber;
    }
}
