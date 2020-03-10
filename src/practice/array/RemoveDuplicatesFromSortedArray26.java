package practice.array;

/**
 * Created by apple on 2020/3/3.
 */
public class RemoveDuplicatesFromSortedArray26 {

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
