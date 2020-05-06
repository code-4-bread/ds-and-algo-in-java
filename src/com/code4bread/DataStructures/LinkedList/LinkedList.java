package com.code4bread.DataStructures.LinkedList;

public class LinkedList {
    private int size = 0;
    private Link head = null;

    public Boolean isEmpty() {
        return size == 0;
    }

    public void addFromHead(int value) {
        if (isEmpty()) {
            head = new Link(value, null);
        } else {
            Link newLink = new Link(value, head);
            head = newLink;
        }

        size++;
    }

    public void addFromTail(int value) {
        if (isEmpty()) {
            throw new RuntimeException("Linked List is empty.");
        }

        Link temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        Link newLink = new Link(value, null);
        temp.setNext(newLink);

        size++;
    }

    public void deleteFromHead() {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty.");
        }
        head = head.getNext();

        size--;
    }

    public void deleteAfter(int value) {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty.");
        }

        Link temp = head;
        while(temp.getValue() != value) {
            temp = temp.getNext();
        }

        temp.setNext(null);

        size--;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The linked list is empty!");
        } else {
            Link temp = head;
            while(temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }
    }
}
