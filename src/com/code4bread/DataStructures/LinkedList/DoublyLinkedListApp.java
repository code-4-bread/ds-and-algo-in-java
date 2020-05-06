package com.code4bread.DataStructures.LinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkList = new DoublyLinkedList();
        doublyLinkList.addFromHead(11);
        doublyLinkList.addFromHead(22);
        doublyLinkList.addFromTail(33);
        doublyLinkList.addFromTail(44);
        doublyLinkList.addFromTail(55);
        System.out.printf("Size - %d\n", doublyLinkList.getSize());
        doublyLinkList.print();
        System.out.println("------------------");
        doublyLinkList.deleteAfter(33);
        doublyLinkList.deleteFromHead();
        doublyLinkList.deleteFromTail();
        System.out.printf("Size - %d\n", doublyLinkList.getSize());
        doublyLinkList.print();
        System.out.println("------------------");
    }
}
