package com.code4bread.DataStructures.LinkedList;

public class Node {
    private int value;
    private Node nextPointer;

    public Node(int value, Node nextPointer) {
        this.value = value;
        this.nextPointer = nextPointer;
    }

    public Node getNext() {
        return this.nextPointer;
    }

    public void setNext(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
