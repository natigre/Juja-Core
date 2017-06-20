package ua.com.juja.core.labs;

public class TestToLab03 {

    public static void main(String[] args) {

        String unknownMonth = DayMonth.getMonthOfYear(13);

        if (unknownMonth == null)
            throw new AssertionError("Result cannot be null");

        if (unknownMonth.equalsIgnoreCase(""))
            System.out.print("OK");

    }
}
