package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOn2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean itIsRaining = false;
        int speed = 0;
        boolean isLightsOn = false;

        System.out.println("Give speed");
        speed = in.nextInt();

        System.out.println("Is it Raining?");
        itIsRaining = in.nextBoolean();

        isLightsOn = itIsRaining && (speed>100);

        System.out.println("Lights are on " +isLightsOn);

    }
}
