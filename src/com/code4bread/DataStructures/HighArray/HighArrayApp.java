package com.code4bread.DataStructures.HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray harray = new HighArray(10);

        harray.insert(1);
        harray.insert(2);
        harray.insert(3);
        harray.insert(4);
        harray.insert(5);
        harray.insert(6);
        harray.insert(7);
        harray.insert(8);
        harray.insert(9);
        harray.insert(10);
        System.out.println(harray.binarySearch((2)));
    }
}
