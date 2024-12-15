package gr.aueb.cf.ch2;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class EurUsd {
    public static void main(String[] args) {

        int eur = 0;
        int usd = 0;
        int usdCents = 0;
        int totalUsdCents = 0;

        Scanner in = new Scanner(System.in);
        final int Parity = 99 ;


        System.out.println("Δωστε Ευρω \n "  );
        eur = in.nextInt();
        totalUsdCents = eur * Parity;
        usd = totalUsdCents / Parity;
        usdCents = totalUsdCents % 100;

        System.out.printf("%d \u20AC = %d \u0024 , %d usa cents", eur, usd, usdCents);




    }
}
