package ua.com.juja.core.labs;

/*
Lab22
 */
public class ArrayUtils {
    public static int[][] rotateClockwise(int[][] arg) {
        if (arg == null || arg.length == 0 || arg[0] == null || arg[0].length != arg.length) {
            return null;
        }

        int w = arg.length;
        int h = arg[0].length;

        for (int i = 0; i < w; i++) {
            if (arg[i] == null || arg[i].length != h) {
                return null;
            }
        }

        int[][] result = new int[h][w];
        // rotate
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                result[i][j] = arg[w - j - 1][i];
            }
        }
        return result;
    }
}
