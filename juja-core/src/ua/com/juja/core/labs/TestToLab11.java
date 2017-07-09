package ua.com.juja.core.labs;

public class TestToLab11 {
    public static void main(String[] args) {
        if (MathUtils.lookFor(1) != 0) {
            throw new AssertionError();
        }
        System.out.println("OK");
    }
}
