package com.zetcode;

import java.util.Calendar;

public class IndexPositionEx {

    public static void main(String[] args) {

        int x = 12;
        int y = 32;
        int z = 43;

        Calendar c = Calendar.getInstance();

        System.out.format("There are %d apples, %d oranges and "
                + "%d pears%n", x, y, z);

        System.out.format("There are %2$d apples, %3$d oranges and "
                + "%1$d pears%n", x, y, z);

        System.out.format("Year: %tY, Month: %<tm, Day: %<td%n", c);
    }
}
