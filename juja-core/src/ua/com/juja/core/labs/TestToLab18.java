package ua.com.juja.core.labs;

public class TestToLab18 {
    public static void main(String[] args) {
        if (Parser.eval("(123+321)-1") != 443) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
