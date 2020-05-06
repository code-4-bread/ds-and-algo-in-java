package com.code4bread.DataStructures.LinkedList;

public class DoublyLinkedList {
    private int size = 0;
    private DoublyLink head = null;
    private DoublyLink tail = null;

    public Boolean isEmpty() {
        return size == 0;
    }

    public void addFromHead(int value) {
        if (isEmpty()) {
            head = tail = new DoublyLink(value, null, null);
        } else {
            DoublyLink newLink = new DoublyLink(value, head, null);
            head.setPrevious(newLink);
            head = newLink;
        }

        size++;
    }

    public void addFromTail(int value) {
        if (isEmpty()) {
            throw new RuntimeException("Linked List is empty.");
        }

        DoublyLink temp = tail;
        DoublyLink newLink = new DoublyLink(value, null, tail);
        temp.setNext(newLink);
        tail = newLink;

        size++;
    }

    public void deleteFromHead() {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty.");
        }
        head = head.getNext();

        size--;
    }

    public void deleteFromTail() {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty.");
        }
        tail = tail.getPrevious();

        size--;
    }

    public void deleteAfter(int value) {
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty.");
        }

        DoublyLink temp = head;
        while(temp.getValue() != value) {
            temp = temp.getNext();
        }

        System.out.println("VALUE");
        System.out.println(temp.getValue());
        DoublyLink previousNode = temp.getNext().getPrevious();
        previousNode.setNext(temp.getNext().getNext());

        temp.setNext(null);
        temp.setPrevious(null);

        size--;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("The linked list is empty!");
        } else {
            DoublyLink temp = head;
            while(temp != null) {
                System.out.println(temp.getValue());
                temp = temp.getNext();
            }
        }
    }
}
