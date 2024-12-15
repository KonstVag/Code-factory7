package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int left_digit = 0;
        int right_digit;
        int sum = 0;

        System.out.println("Give a two Digit number");
        num = in.nextInt();

        left_digit = num / 10;
        right_digit = num % 10;
        sum = right_digit + left_digit;

        System.out.printf(" %d",sum);


    }
}
