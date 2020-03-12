package datastructure.queue;

public class ArrayQueue<E> implements Queue<E> {

    public static final int CAPACITY = 1000;

    private E[] data;
    private int front = 0;
    private int rear = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if (rear == data.length - 1) throw new IllegalStateException("Queue is full");
        data[rear] = e;
        rear++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E result = data[front];
        data[front] = null;
        front++;
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        int k = front;
        for (int j = 0; j < rear; j++) {
            if (j > 0)
                sb.append(", ");
            sb.append(data[k]);
            k = (k + 1) % data.length;
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> Q = new ArrayQueue<>();   // contents: ()
        Q.enqueue(5);                              // contents: (5)
        Q.enqueue(3);                              // contents: (5, 3)
        System.out.println(Q.size());                // contents: (5, 3)     outputs 2
        System.out.println(Q.dequeue());             // contents: (3)        outputs 5
        System.out.println(Q.isEmpty());             // contents: (3)        outputs false
        System.out.println(Q.dequeue());             // contents: ()         outputs 3
        System.out.println(Q.isEmpty());             // contents: ()         outputs true
        System.out.println(Q.dequeue());             // contents: ()         outputs null
        Q.enqueue(7);                             // contents: (7)
        Q.enqueue(9);                             // contents: (7, 9)
        System.out.println(Q.first());               // contents: (7, 9)     outputs 7
        Q.enqueue(4);                             // contents: (7, 9, 4)
        System.out.println(Q.size());                // contents: (7, 9, 4)  outputs 3
        System.out.println(Q.dequeue());             // contents: (9, 4)     outputs 7
        Q.enqueue(6);                              // contents: (9, 4, 6)
        Q.enqueue(8);                              // contents: (9, 4, 6, 8)
        System.out.println(Q.dequeue());              // contents: (4, 6, 8)  outputs 9
        System.out.println(Q.size());                 // contents: (4, 6, 8)  outputs 3
    }
}
