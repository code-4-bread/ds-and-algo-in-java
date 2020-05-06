package com.code4bread.DataStructures.LinkedList;

public class Link {
    private int value;
    private Link nextPointer;

    public Link(int value, Link nextPointer) {
        this.value = value;
        this.nextPointer = nextPointer;
    }

    public Link getNext() {
        return this.nextPointer;
    }

    public void setNext(Link nextPointer) {
        this.nextPointer = nextPointer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
