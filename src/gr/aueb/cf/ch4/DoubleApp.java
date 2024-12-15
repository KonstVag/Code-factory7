package gr.aueb.cf.ch4;

public class DoubleApp {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;
        double result = 0;
        double result2 = 0;

        result = num1 / num2;
        result2 = num1 % num2;

        System.out.printf("print the result %.2f " ,result);
        System.out.println("print result2 " + result2);


    }
}
