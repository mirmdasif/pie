package net.asifhossain.pie.chapter4.stack;

public class LinkedListStack<T> implements Stack<T> {
    private int size = 0;
    private Node head;

    @Override
    public void push(T object) {
        Node node = new Node(object);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Empty Stack");
        T object = head.value;
        head = head.next;
        size--;

        return object;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    private class Node {
        T value;
        Node next;

        private Node(T value) {
            this.value = value;
        }
    }
}
