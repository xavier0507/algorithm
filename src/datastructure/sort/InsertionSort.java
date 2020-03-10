package datastructure.sort;

/**
 * Created by apple on 2020/3/6.
 */
public class InsertionSort extends Sort {

    @Override
    void sort(int[] numbers) {
        int[] updatedNumbers = numbers;

        for (int i = 1; i < updatedNumbers.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if (updatedNumbers[j] > updatedNumbers[j+1]) {
                    updatedNumbers = switchContents(updatedNumbers, j, j+1);
                }
            }
        }

        printSortResults(updatedNumbers);
    }
}
