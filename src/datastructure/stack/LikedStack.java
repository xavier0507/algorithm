package datastructure.stack;

import datastructure.list.SinglyLinkedList;

public class LikedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        LikedStack<Integer> stack = new LikedStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
