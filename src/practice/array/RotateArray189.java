package practice.array;

/**
 * Created by apple on 2020/3/2.
 */
public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        int[] tempArray = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            tempArray[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArray[i];
            System.out.print(nums[i] + " ");
        }
    }
}
