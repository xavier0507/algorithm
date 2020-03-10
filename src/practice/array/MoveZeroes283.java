package practice.array;

/**
 * Created by apple on 2020/3/2.
 */
public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
