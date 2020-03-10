package datastructure.sort;

/**
 * Created by apple on 2020/3/6.
 */
public class BubbleSort extends Sort {

    @Override
    void sort(int[] numbers) {
        int[] updatedNumbers = numbers;

        for (int i = 0; i < updatedNumbers.length - 1; i++) {
            for (int j = 0; j < updatedNumbers.length - 1; j++) {
                if (updatedNumbers[j] > updatedNumbers[j + 1]) {
                    updatedNumbers = switchContents(updatedNumbers, j, j + 1);
                }
            }
        }

        printSortResults(updatedNumbers);
    }
}
