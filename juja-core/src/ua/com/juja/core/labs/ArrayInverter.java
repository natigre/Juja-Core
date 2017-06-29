package ua.com.juja.core.labs;

import java.util.Arrays;

/*
Lab08
It is necessary to rewrite the cycle from the increment of the counter from 0 to the middle of the
array by a cycle from the middle of the array to 0 (the increment (k) is replaced by decrement (k--))
 */
public class ArrayInverter {

    public static void invert(int[] arr) {

        int center = arr.length % 2 == 0 ? arr.length / 2 - 1 : arr.length / 2;

        for (int k = center; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 14, 2, 3, 7};
        invert(arr);
    }
}
