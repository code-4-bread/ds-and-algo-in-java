package com.code4bread.HighArray;

public class HighArray {
    private long[] array;
    private int elementCount;
    private int maxLength;

    public HighArray(int maxLength) {
        this.maxLength = maxLength;
        array = new long[maxLength];
        elementCount = 0;
    }

    public void insert(long value) {
        if (elementCount + 1 > maxLength) {
            throw new Error("Maximum array length reached");
        }
        array[elementCount] = value;
        elementCount++;
    }

    public void delete(long value) {
        for (int i = 0; i < elementCount; i++) {
            if (array[i] == value) {
                /* Move elements above down by 1 */
                for (int j = i; j < elementCount - 1; j++) {
                    array[j] = array[j + 1];
                }
                elementCount--;
            }
        }
    }

    /* Returns the index of searching value */
    public int search(long value) {
        for (int i = 0; i < elementCount; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void display() {
        for (int i = 0; i < elementCount; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
    }
}
