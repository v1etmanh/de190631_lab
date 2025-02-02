package com.jmc.week2.excercise4;



public class ArrayStack {
    private int capacity;
    private int[] container;
    private int top;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.container = new int[capacity];
        this.top = -1;
    }

    public ArrayStack() {
        this(5);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    private void resize() {
        int[] temp = new int[capacity * 2];
        System.arraycopy(container, 0, temp, 0, container.length);
        container = temp;
        capacity *= 2;
    }

    public void push(int data) {
        if (isFull()) {
            resize();
        }
        container[++top] = data;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty. Cannot pop element.");
        }
        return container[top--];
    }

    public void traversal() {
        int current = top;
        while (current != -1) {
            System.out.print(container[current--] + "  ");
        }
        System.out.println();
    }
}
