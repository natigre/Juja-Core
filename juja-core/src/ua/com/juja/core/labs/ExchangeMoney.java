package ua.com.juja.core.labs;
/*
Lab19
 */
public class ExchangeMoney {
    static int[] coins = {1, 2, 5, 10, 25, 50};

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange <= 0) {
            return 0;
        }
        return exchangeAmountOfCoinsRecursion(amountForExchange, coins.length);
    }

    private static int exchangeAmountOfCoinsRecursion(int amountForExchange, int coinsLength) {
        int index = coinsLength - 1;
        if (index == 0) {
            return 1;
        }

        if (amountForExchange <= 0) {
            return 1;
        }
        if (amountForExchange >= coins[index]) {
            return exchangeAmountOfCoinsRecursion(amountForExchange - coins[index], index + 1) +
                    exchangeAmountOfCoinsRecursion(amountForExchange, index);
        } else {
            return exchangeAmountOfCoinsRecursion(amountForExchange, index);
        }
    }
}
