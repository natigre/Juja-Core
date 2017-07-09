package ua.com.juja.core.labs;
/*
Lab12
 */

public class ArrayUtilsLeftSegment {
    public static int[] lookFor(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array length = 0");
        }

        // checking if all the array items <=0
        boolean checkArray = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                checkArray = true;
            }
        }
        if (!checkArray) return new int[]{};

        // check if array contain only 1 item
        if (array.length == 1 && array[0] > 0) {
            return new int[]{0, 0};
        }

        int[][] doubleArray = new int[array.length][2];    // will store all positive segments in double array
        boolean isFound = false;                           // we will set this flag = true when we find fstPos
        int firstPosition = 0;                             // position of the first positive num in array inside a segment
        int index = 0;                                     // index of array
        int i = 0;                                         // index of double array

        // main loop
        do {
            if (!isFound && array[index] > 0) {
                isFound = true;
                firstPosition = index;
            } else if (isFound && array[index] > 0) {
                if (index == array.length - 1) {
                    doubleArray[i++] = new int[]{firstPosition, index};
                }
            } else if (isFound && array[index] <= 0) {
                doubleArray[i++] = new int[]{firstPosition, index - 1};
                isFound = false;
            }
            index++;
        } while (index <= (array.length - 1));

        // find the biggest segment from left to right
        int indexOfSegment = 0;
        int segmentLength = 0;
        if (doubleArray[0].length > 1)
        for (int j = 0; j < doubleArray[0].length; j++) {
            int xa = doubleArray[j][0];
            int xb = doubleArray[j][1];
            if ((xb - xa) > segmentLength) {
                segmentLength = xb - xa;
                indexOfSegment = j;
            }
        }
        return new int[]{doubleArray[indexOfSegment][0], doubleArray[indexOfSegment][1]};
    }
}
