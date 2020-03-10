package datastructure.sort;

/**
 * Created by apple on 2020/3/8.
 */
public class ShellSort extends Sort {

    private int[] updatedNumbers = {};

    @Override
    void sort(int[] numbers) {
        updatedNumbers = numbers;

        for (int i = updatedNumbers.length / 2; i > 0; i--) {
            for (int j = 0; j < updatedNumbers.length && (j + i) < updatedNumbers.length; j++) {
                if (updatedNumbers[j] > updatedNumbers[j + i]) {
                    updatedNumbers = switchContents(numbers, j, j + i);
                }
            }
        }

        printSortResults(updatedNumbers);
    }
}
