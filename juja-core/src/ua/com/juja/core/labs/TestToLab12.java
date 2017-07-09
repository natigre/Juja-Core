package ua.com.juja.core.labs;

import java.util.Arrays;

public class TestToLab12 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1};
        int[] expected = {1, 3};
        int[] actual = ArrayUtilsLeftSegment.lookFor(array);

        if (!Arrays.equals(actual,expected)) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }
}
