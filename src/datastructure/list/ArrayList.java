package datastructure.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E> {

    public static final int CAPACITY = 16;

    private E[] data;
    private int size = 0;

    public ArrayList() {
        this(CAPACITY);
    }

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        return data[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = e;
        return temp;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int k = size - 1; k >= i; k--) {
            data[k + 1] = data[k];
        }
        data[i] = e;
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);

        E temp = data[i];
        for (int k = i; k < size - 1; k++) {
            data[k] = data[k + 1];
        }
        data[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int j = 0;
            private boolean removable = false;

            @Override
            public boolean hasNext() {
                return j < size;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (j == size) throw new NoSuchElementException("No next element");

                removable = true;
                return data[j++];
            }

            @Override
            public void remove() {
                if (!removable) throw new IllegalStateException("nothing to remove");

                ArrayList.this.remove(j - 1);
                j--;
                removable = false;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int j = 0; j < size; j++) {
            if (j > 0) {
                sb.append(", ");
            }
            sb.append(data[j]);
        }
        sb.append(")");
        return sb.toString();
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
        if (i < 0 || i >= n) throw new IndexOutOfBoundsException("Illegal index: " + i);
    }

    protected void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int k = 0; k < size; k++) {
            temp[k] = data[k];
        }
        data = temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0, 0);
        arrayList.add(1, 1);
        arrayList.add(2, 2);
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.set(1, 3);
        System.out.println(arrayList);
    }
}
