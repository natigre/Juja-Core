package ua.com.juja.core.labs;

/*
lab04
 */
public class DayWeek {

    public static String getDayOfTheWeek(int dayNum) {

        String getDayOfTheWeek;
        switch (dayNum) {
            case 1:
                getDayOfTheWeek = "Monday";
                break;
            case 2:
                getDayOfTheWeek = "Tuesday";
                break;
            case 3:
                getDayOfTheWeek = "Wednesday";
                break;
            case 4:
                getDayOfTheWeek = "Thursday";
                break;
            case 5:
                getDayOfTheWeek = "Friday";
                break;
            case 6:
                getDayOfTheWeek = "Saturday";
                break;
            case 7:
                getDayOfTheWeek = "Sunday";
                break;
            default:
                getDayOfTheWeek = "";
        }
        return getDayOfTheWeek;
    }
}