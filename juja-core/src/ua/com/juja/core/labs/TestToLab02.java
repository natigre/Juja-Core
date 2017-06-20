package ua.com.juja.core.labs;

public class TestToLab02 {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(false, true);

        if (emptyPurchases == null) {
            throw new AssertionError("Result cannot be null");
        }

        if (emptyPurchases.isEmpty())
            System.out.print("OK");
    }
}
