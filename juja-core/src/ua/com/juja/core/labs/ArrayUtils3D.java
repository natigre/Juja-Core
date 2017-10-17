package ua.com.juja.core.labs;

/*
Lab23
 */

public class ArrayUtils3D {
    public static int[][][] rotateClockwise(int[][][] arg) {
        if (arg == null || arg.length == 0 || arg[0] == null || arg[0].length != arg.length || arg[0][0] == null) {
            return null;
        }

        int w = arg.length;
        int h = arg[0].length;
        int d = arg[0][0].length;

        for (int i1 = 0, k2 = 0; i1 < arg.length; i1++, k2++) {
            if (arg[i1].length != w ) {
                return null;
            }
            if (arg[i1] == null) {
                return null;
            }
            for (int j1 = 0, i2 = 0; j1 < arg[i1].length; j1++, i2++) {
                if (arg[i1][j1].length != arg[i1].length) {
                    return null;
                }
            }
        }

        int[][][]result = new int[h][w][d];
        // rotate
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < d; k++) {
                    result[i][j][k] = arg[k][i][j];
                }
            }
        }
        return result;
    }
}
