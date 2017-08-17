package net.asifhossain.pie.chapter4.stack;

public class ArrayStack <T> implements Stack<T> {
    private static final int DEFAULT_SIZE = 100;

    private T[] array;
    private int size;

    ArrayStack() {
        array = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void push(T object) {
        array[size++] = object;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Empty Stack");
        return array[--size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
