package com.code4bread.SelectionSort;

public class SelectionSort {
    public static void sort(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int curValue = intArray[i];
            int curValueIndex = i;
            for (int j = i+1; j < intArray.length; j++) {
                if (curValue > intArray[j]) {
                    curValue = intArray[j];
                    curValueIndex = j;
                }
            }
            swap(intArray, i, curValueIndex);
        }
    }

    private static void swap(int[] intArray, int primaryIndex, int secondaryIndex) {
        int primaryValue = intArray[primaryIndex];
        intArray[primaryIndex] = intArray[secondaryIndex];
        intArray[secondaryIndex] = primaryValue;
    }
}
