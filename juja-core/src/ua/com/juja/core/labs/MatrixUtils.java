package ua.com.juja.core.labs;

import java.util.Arrays;

/*

 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {
        if (fst == null || snd == null || fst[0].length != snd.length) {
            throw new IllegalArgumentException();
        }

        int[][] result = new int[fst.length][snd[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < fst[0].length; k++) {
                    result[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int fst[][] = {{1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1}};
        int snd[][] = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
        System.out.println(Arrays.deepToString(mul(fst, snd)));
    }
}
