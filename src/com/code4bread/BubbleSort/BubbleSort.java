package com.code4bread.BubbleSort;

public class BubbleSort {
    public static void sort(int[] intArray) {
        boolean isSorted = false;
        int lengthToCheck = intArray.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lengthToCheck; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                    isSorted = false;
                }
            }
            lengthToCheck--;
        }
    }

    private static void swap(int[] intArray, int primaryIndex, int secondaryIndex) {
        int primaryValue = intArray[primaryIndex];
        intArray[primaryIndex] = intArray[secondaryIndex];
        intArray[secondaryIndex] = primaryValue;
    }
}
