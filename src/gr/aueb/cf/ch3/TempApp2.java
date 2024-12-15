package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TempApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean tempBelowZero = false ;

        System.out.println("Give Temperature" );
         temp = in.nextInt();
        tempBelowZero = temp <0;

        System.out.printf("Temp is" +tempBelowZero);
    }
}
