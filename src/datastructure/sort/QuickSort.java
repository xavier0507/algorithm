package datastructure.sort;

/**
 * Created by apple on 2020/3/7.
 */
public class QuickSort extends Sort {

    private int[] updatedNumbers = {};

    @Override
    void sort(int[] numbers) {
        updatedNumbers = numbers;
        sort(updatedNumbers, 0, numbers.length - 1);
        for (int number : updatedNumbers) System.out.print(number + " ");
    }

    private void sort(int[] numbers, int left, int right) {
        if (left < right) {
            int i = left + 1;
            int j = right;
            int pivot = numbers[left];

            do {
                while (i < numbers.length && numbers[i] < pivot) i++;
                while (j > 0 && numbers[j] > pivot) j--;

                if (i < j) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            } while (i < j);

            int temp = numbers[left];
            numbers[left] = numbers[j];
            numbers[j] = temp;

            sort(numbers, left, j - 1);
            sort(numbers, j + 1, right);
        }
    }
}
