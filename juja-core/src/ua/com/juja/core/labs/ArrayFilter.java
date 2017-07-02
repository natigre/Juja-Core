package ua.com.juja.core.labs;

import java.util.Arrays;
/*
lab09
 */
public class ArrayFilter {

    public static void main(String[] args) {
        int[] arr = {7, 6, 13, 5, 2, 17, 0};
        System.out.println(Arrays.toString(filterEven(arr)));

    }

    public static int[] filterEven(int[] nums) {
        int evenCount = 0;

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenCount++] = nums[i];
            }
        }
        return result;
    }
}
