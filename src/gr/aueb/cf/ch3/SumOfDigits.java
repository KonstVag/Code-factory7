package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 0;
        int sum =0;
        int leftDigit = 0;
        int rightDigit = 0;
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Give an Integer");
        num = inputNum.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;
        sum = rightDigit + leftDigit;

        System.out.printf("The sum of digits of %d is %d" , num  ,sum );








    }
}
