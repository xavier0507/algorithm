package datastructure.sort;

/**
 * Created by apple on 2020/3/6.
 */
public class SelectionSort extends Sort {

    @Override
    void sort(int[] numbers) {
        int[] updatedNumbers = numbers;

        for (int i = 0; i < updatedNumbers.length - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < updatedNumbers.length; j++) {
                if (updatedNumbers[j] < updatedNumbers[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            updatedNumbers = switchContents(updatedNumbers, i, minValueIndex);
        }

        printSortResults(updatedNumbers);
    }
}
