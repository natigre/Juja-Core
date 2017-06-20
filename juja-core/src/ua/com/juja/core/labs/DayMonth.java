package ua.com.juja.core.labs;

/*
lab03
 */
public class DayMonth {

    public static String getMonthOfYear(int number) {

        String getMonthOfYear = null;

        switch (number) {
            case 1:
                getMonthOfYear = "January";
                break;
            case 2:
                getMonthOfYear = "February";
                break;
            case 3:
                getMonthOfYear = "March";
                break;
            case 4:
                getMonthOfYear = "April";
                break;
            case 5:
                getMonthOfYear = "May";
                break;
            case 6:
                getMonthOfYear = "June";
                break;
            case 7:
                getMonthOfYear = "July";
                break;
            case 8:
                getMonthOfYear = "August";
                break;
            case 9:
                getMonthOfYear = "September";
                break;
            case 10:
                getMonthOfYear = "October";
                break;
            case 11:
                getMonthOfYear = "November";
                break;
            case 12:
                getMonthOfYear = "December";
                break;
            default:
                getMonthOfYear = "";
        }
        return getMonthOfYear;
    }
}
