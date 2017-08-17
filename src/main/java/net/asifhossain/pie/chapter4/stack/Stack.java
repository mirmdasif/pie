package net.asifhossain.pie.chapter4.stack;

public interface Stack <T> {

    void push(T object);

    T pop();

    int size();

    boolean isEmpty();
}
