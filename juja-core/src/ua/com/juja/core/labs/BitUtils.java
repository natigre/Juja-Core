package ua.com.juja.core.labs;
/*
Lab07
 */

public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        if(((b >> i) & 1) != ((b >> j) & 1)) {
            b ^= (1L << i) | (1L << j);
        }
        return b;
    }
}
