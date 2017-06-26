package ua.com.juja.core.labs;
/*
Lab06
 */

public class IntegerUtilsRightShift {

    public static int rightShift(int arg) {
        int min = 1;
        int max = 0b10000000_00000000_00000000_00000000;
        int result = arg >> 1;

        if ( max == (max & arg) ) {
            result = (result ^ max);
        }
        if ( min == (min & arg) ) {
            result = (result | max);
        }
        return result;
    }
}
