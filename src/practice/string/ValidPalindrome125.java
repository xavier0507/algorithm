package practice.string;

/**
 * Created by apple on 2020/3/8.
 */
public class ValidPalindrome125 {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        String updatedString = s.toLowerCase();
        int i = 0;
        int j = updatedString.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(updatedString.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(updatedString.charAt(j))) {
                j--;
            } else if (updatedString.charAt(i) == updatedString.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
