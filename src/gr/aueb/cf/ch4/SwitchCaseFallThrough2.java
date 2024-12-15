package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseFallThrough2 {
    public static void main(String[] args) {
        int grade = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease give grade");
        grade = scanner.nextInt();

        switch (grade){
            case 10:
                System.out.println("Excellent");
                break;

            case 9 :
                System.out.println("Very Good");
                break;

            default:
                System.out.println("error");
                break;


        }





    }

}
