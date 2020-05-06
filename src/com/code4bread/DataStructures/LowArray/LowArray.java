package com.code4bread.DataStructures.LowArray;

public class LowArray {

    private long[] array;

    public LowArray(int size) {
        array = new long[size];
    }

    public void add(int index, long value) {
        array[index] = value;
    }

    public long get(int index) {
        return array[index];
    }
}
