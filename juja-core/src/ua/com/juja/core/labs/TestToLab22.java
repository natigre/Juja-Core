package ua.com.juja.core.labs;

public class TestToLab22 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(null);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
