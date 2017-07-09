package ua.com.juja.core.labs;

import java.util.Arrays;

public class TestToLab13 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {5, 8};
        int[] actual = ArrayUtilsRightSegment.lookFor(array);

        if (!Arrays.equals(actual,expected)) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }
}
