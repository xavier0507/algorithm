package datastructure.sort;

/**
 * Created by apple on 2020/3/10.
 */
public class RadixSort extends Sort {

    @Override
    void sort(int[] numbers) {
        int[] order = new int[numbers.length];
        int[][] temp = new int[numbers.length][numbers.length];
        int n = 1;
        int k = 0;
        int lsd;

        while (n <= 10000) {
            for (int number : numbers) {
                lsd = (number / n) % 10;
                temp[lsd][order[lsd]] = number;
                order[lsd]++;
            }

            for (int i = 0; i < numbers.length; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        numbers[k] = temp[i][j];
                        k++;
                    }
                }
                order[i] = 0;
            }

            n *= 10;
            k = 0;
        }

       printSortResults(numbers);
    }
}
