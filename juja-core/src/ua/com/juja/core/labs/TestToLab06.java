package ua.com.juja.core.labs;

public class TestToLab06 {

    public static void main(String[] args) {
        if (IntegerUtilsRightShift.rightShift(
                0b00000000_00000000_00000000_00000001) !=
                0b10000000_00000000_00000000_00000000) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
