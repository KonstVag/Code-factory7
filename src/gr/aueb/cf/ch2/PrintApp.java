package gr.aueb.cf.ch2;

public class PrintApp {
    public static void main(String[] args) {
        int day = 7;
        int month = 6;
        int year = 2024;

        System.out.println("The date is: " +day + "/" + month + "/" + year );
        System.out.printf("The date is:  %,d / %,d / %d " , day, month , year);
    }
}
