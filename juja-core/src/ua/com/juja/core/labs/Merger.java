package ua.com.juja.core.labs;

import java.util.Arrays;
/*
lab10
 */

public class Merger {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;

        while (fstIndex + sndIndex != result.length) {
            if (fstIndex < fst.length && sndIndex < snd.length) {
                if (fst[fstIndex] < snd[sndIndex]) {
                    result[fstIndex + sndIndex] = fst[fstIndex++];
                } else {
                    result[fstIndex + sndIndex] = snd[sndIndex++];
                }
            }
            else if (fstIndex < fst.length) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else if (sndIndex < snd.length) {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] fst = {1, 2, 3, 4, 5, 16};
        int[] snd = {6, 7, 8, 9, 10, 11, 12};

        int[] result = merge(fst, snd);
        System.out.println(Arrays.toString(result));
    }
}
