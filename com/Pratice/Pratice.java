package com.Pratice;

import java.util.Arrays;

public class Pratice{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Alternate swapping elements from the beginning and end of the array
        for (int i = 0, j = arr.length - 1; i < j; i += 2, j -= 2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
