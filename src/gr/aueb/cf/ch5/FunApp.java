package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FunApp {
    public static void main(String[] args) {
        int age = 18;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give your age");
        age = sc.nextInt();

        if ( age>=18) {
            System.out.println("Is eligible for voting");
        }
        else
            System.out.println(" You re not Eligible");

    }

}
