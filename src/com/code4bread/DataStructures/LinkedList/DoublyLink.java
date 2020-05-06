package com.code4bread.DataStructures.LinkedList;

public class DoublyLink {
    private int value;
    private DoublyLink nextPointer;
    private DoublyLink previousPointer;

    public DoublyLink(int value, DoublyLink nextPointer, DoublyLink previousPointer) {
        this.value = value;
        this.nextPointer = nextPointer;
        this.previousPointer = previousPointer;
    }

    public DoublyLink getNext() {
        return this.nextPointer;
    }

    public void setNext(DoublyLink nextPointer) {
        this.nextPointer = nextPointer;
    }

    public DoublyLink getPrevious() {
        return this.previousPointer;
    }

    public void setPrevious(DoublyLink previousPointer) {
        this.previousPointer = previousPointer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
