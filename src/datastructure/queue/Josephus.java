package datastructure.queue;

public class Josephus {

    public static <E> E Josephus(CircularQueue<E> queue, int k) {
        if (queue.isEmpty()) return null;

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.rotate();
            }

            E e = queue.dequeue();
            System.out.println("    " + e + " is out");
        }

        return queue.dequeue();
    }

    public static <E> CircularQueue<E> buildQueue(E a[]) {
        CircularQueue<E> queue = new LinkedCircularQueue<>();

        for (E e : a) {
            queue.enqueue(e);
        }

        return queue;
    }

    public static void main(String[] args) {
        String[] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
    }
}
