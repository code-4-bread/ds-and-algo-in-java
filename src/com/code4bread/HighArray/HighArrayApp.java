package com.code4bread.HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArray harray = new HighArray(3);

        harray.insert(1);
        harray.insert(2);
        harray.insert(3);
        harray.display();
        harray.delete(2);
        harray.display();
        harray.insert(4);
        harray.display();
        System.out.printf("Found 4 at index %d\n", harray.search(4));
        harray.display();
    }
}
