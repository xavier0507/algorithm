package datastructure.queue;

public class LinkedCircularQueue<E> implements CircularQueue<E> {

    private CircularlyLinkedList<E> circle = new CircularlyLinkedList<>();

    @Override
    public int size() {
        return circle.size();
    }

    @Override
    public boolean isEmpty() {
        return circle.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        circle.addLast(e);
    }

    @Override
    public E first() {
        return circle.first();
    }

    @Override
    public E dequeue() {
        return circle.removeFirst();
    }

    @Override
    public void rotate() {
        circle.rotate();
    }

    public String toString() {
        return circle.toString();
    }
}
