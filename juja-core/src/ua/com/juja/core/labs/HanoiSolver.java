package ua.com.juja.core.labs;

import java.util.Stack;
/*
Lab17
 */

public class HanoiSolver {
    public static void exchange(Stack from, Stack help, Stack to, int count) {

        if (count > 0) {
            exchange(from, to, help, count - 1); // перенести башню из n−1 диска на 2-й штырь
            int biggest = (int) from.pop();

            to.push(biggest); // переносим самый большой диск на 3-й штырь
            exchange(help, from, to, count - 1); // перенеси башню из n−1 диска на 3-й штырь

        }
    }
}
