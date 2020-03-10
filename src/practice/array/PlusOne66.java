package practice.array;

/**
 * Created by apple on 2020/3/3.
 */
public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
