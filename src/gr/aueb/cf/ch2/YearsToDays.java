package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years to days
 */

public class YearsToDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int years = 0;
        int days =0;
        final int Days_to_years = 365;

        System.out.println("Give Years");
        years = in.nextInt();
        days = Days_to_years * years ;

        System.out.printf("%d years equals to %d days" ,years, days) ;

    }
}
