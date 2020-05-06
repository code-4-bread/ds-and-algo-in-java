package com.code4bread.DataStructures.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.addFromHead(11);
        linkList.addFromTail(22);
        linkList.addFromTail(33);
        linkList.addFromTail(44);
        linkList.addFromTail(55);
        linkList.print();
        System.out.println("------------------");
        linkList.reverse();
        linkList.print();
        System.out.println("------------------");
    }
}
