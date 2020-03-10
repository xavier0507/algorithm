package datastructure.sort;

/**
 * Created by apple on 2020/3/6.
 */
abstract class Sort {

    int[] switchContents(int[] numbers, int first, int second) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
        return numbers;
    }

    void printSortResults(int[] numbers) {
        for (int number : numbers) System.out.print(number + " ");
    }

    abstract void sort(int[] numbers);
}
