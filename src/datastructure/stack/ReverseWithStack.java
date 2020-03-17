package datastructure.stack;

import java.util.Arrays;

public class ReverseWithStack {

    public static <E> void reverse(E[] inputs) {
        ArrayStack<E> stack = new ArrayStack<>(inputs.length);

        for (E input : inputs) {
            stack.push(input);
        }

        for(int i = 0; i < inputs.length; i++) {
            inputs[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {4, 8, 15, 16, 23, 42};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        reverse(strings);
        System.out.println(Arrays.toString(strings));
    }
}
