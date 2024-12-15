package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isItRaining = false;
        boolean isItSnowing = false;

        System.out.println("Give temp" );
        temp = in.nextInt();

        System.out.println("Is it Raining");
        isItRaining = in.nextBoolean();

        isItSnowing = isItRaining && (temp<0);


        System.out.printf("Is Snowing" + isItSnowing);




    }
}
