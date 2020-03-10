package practice.array;

/**
 * Created by apple on 2020/3/5.
 */
public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;

        int[] sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        int max = sumArr[0];

        for (int i = 1; i < nums.length; i++) {
            sumArr[i] = Math.max(sumArr[i - 1] + nums[i], nums[i]);
        }

        for (int j = 1; j < sumArr.length; j++) {
            if (sumArr[j] > max) max = sumArr[j];
        }

        return max;
    }
}
