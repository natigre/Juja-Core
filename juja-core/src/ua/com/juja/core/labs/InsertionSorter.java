package ua.com.juja.core.labs;

/*
Lab16
 */

import java.util.Arrays;

public class InsertionSorter {
    public static void sort(int[] arr) {

        for (int k = 0; k < arr.length; k++) {
            int newElem = arr[k];
            int index = Arrays.binarySearch(arr, 0, k, newElem);
            if (index < 0){
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, k - index);
            arr[index] = newElem;
        }
    }
}
