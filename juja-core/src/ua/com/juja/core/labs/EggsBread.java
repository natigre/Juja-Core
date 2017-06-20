package ua.com.juja.core.labs;

/*
lab02
 */
public class EggsBread {

    public static String printPurchases(boolean hasEggs, boolean hasBread) {

        String purchases = "";
        if (hasEggs && hasBread) {
            purchases = "eggs" + "," + "bread";
        } else if (!hasEggs && hasBread) {
            purchases = "bread";
        } else if (hasEggs && !hasBread) {
            purchases = "eggs";
        } else if (!hasEggs && !hasBread) {
            purchases = "";
        }
        System.out.println(purchases);
        return purchases;
    }
}
