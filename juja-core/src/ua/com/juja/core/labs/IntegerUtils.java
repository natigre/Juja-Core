package ua.com.juja.core.labs;
/*
Lab05
 */

public class IntegerUtils {
    public static int leftShift(int arg) {

        int result = arg << 1;
        int x = 0b10000000_00000000_00000000_00000000;

        if (x == (x & arg)) {
            result += 1;
        }

        return result;
    }
}
