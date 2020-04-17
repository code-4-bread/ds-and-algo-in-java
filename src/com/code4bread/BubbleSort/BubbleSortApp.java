package com.code4bread.BubbleSort;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        int[] arr = new int[]{ 5, 10, 8, 2, 1, 3, 7, 11, 4 };
        System.out.printf("Before sorting - %s\n", Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.printf("After sorting - %s\n", Arrays.toString(arr));
    }
}
