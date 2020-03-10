package datastructure.search;

/**
 * Created by apple on 2020/3/10.
 */
class BinarySearch implements Search {

    @Override
    public int search(int[] numbers, int searchNumber) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (searchNumber == numbers[middle]) return middle;

            if (searchNumber < numbers[middle]) right = middle - 1;

            if (searchNumber > numbers[middle]) left = middle + 1;
        }

        return -1;
    }
}
