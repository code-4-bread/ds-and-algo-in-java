package com.code4bread.LowArray;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr;

        arr = new LowArray(10);

        arr.add(0, 1);

        System.out.println(arr.get(0));
    }
}
