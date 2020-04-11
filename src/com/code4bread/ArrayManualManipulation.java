package com.code4bread;

public class ArrayManualManipulation {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int arraySize = 6;

        System.out.println("Original Array");
        for (int i = 0; i <  arraySize; i++) {
            System.out.println(intArray[i]);
        }

        int deleteKey = 4;

        for (int i = 0; i <  arraySize; i++) {
            if (intArray[i] == deleteKey) {
                for (int j = i; j < (arraySize - 1); j++) {
                    intArray[j] = intArray[j+1];
                }
                arraySize--;
            }
        }

        System.out.println("After deletion");
        for (int i = 0; i <  arraySize; i++) {
            System.out.println(intArray[i]);
        }
    }
}
