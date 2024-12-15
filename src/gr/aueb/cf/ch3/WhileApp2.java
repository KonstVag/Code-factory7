package gr.aueb.cf.ch3;

import java.util.Scanner;

public class WhileApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int inputNum = 0;

        while (inputNum<100){
            System.out.println("give number");
            inputNum = sc.nextInt();
            a++;
            //System.out.println("Exit");
        }
        System.out.println("Exit");
    }
}
