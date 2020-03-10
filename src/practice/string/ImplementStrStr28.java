package practice.string;

/**
 * Created by apple on 2020/3/10.
 */
public class ImplementStrStr28 {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
