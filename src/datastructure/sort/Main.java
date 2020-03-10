package datastructure.sort;

/**
 * Created by apple on 2020/3/6.
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {6, 7, 3, 9, 5, 22, 10, 4, 2, 33, 10, 59, 43};
        /*BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);*/

        /*SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);*/

        /*InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(numbers);*/

        /*QuickSort quickSort = new QuickSort();
        quickSort.sort(numbers);*/

        RadixSort radixSort = new RadixSort();
        radixSort.sort(numbers);
    }
}
