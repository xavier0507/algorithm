package datastructure.search;

/**
 * Created by apple on 2020/3/10.
 */
public class SequenceSearch implements Search {

    @Override
    public int search(int[] numbers, int searchNumber) {
        for (int number : numbers) {
            if (number == searchNumber) return number;
        }

        return -1;
    }
}
