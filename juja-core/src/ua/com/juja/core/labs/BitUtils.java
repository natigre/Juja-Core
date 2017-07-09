package ua.com.juja.core.labs;
/*
Lab07
 */

public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
//        if(((b >> i) & 1) != ((b >> j) & 1)) {
//            b ^= (1 << i) | (1 << j);
//        }
//        return b;


        // Bit positions are from 7 (MSB) to 0 (LSB)
        // mask: bit = 1 position from right to left
        byte mask1 = (byte) (1 << i);   // i=0: 0000_0001
        byte mask2 = (byte) (1 << j);   // j=6: 0100_0000

        byte result = b;                // 1111_0000

        if ((b & mask1) != 0) {         // means if current bit in the number = 1 -> change bit (using mask2) to 1 in b

            /*
            ex.
            set one of the bit to '1':
            Bit 0 (LSB) -> 1:     result |= 1 << 0;   b: 1111_0001
             */
            result |= mask2;


        } else {                        // means if current bit in the number = 0 -> change bit (using mask2) to 0 in b

            /*
            ex.
            set one of the bit to '0':
            Bit 6       -> 0:     result &= ~(1 << 6);   b: 1011_0000
             */
            result &= ~mask2;
        }

        // using the similar algorithm for mask2
        if ((b & mask2) != 0) {
            result |= mask1;
        } else  {
            result &= ~mask1;
        }

        return result;
    }
}
