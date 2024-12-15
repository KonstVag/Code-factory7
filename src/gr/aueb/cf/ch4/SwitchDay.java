package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchDay
{
    public static void main(String[] args) {
        // Δημιουργία ενός αντικειμένου Scanner για την ανάγνωση της εισόδου του χρήστη
        Scanner scanner = new Scanner(System.in);

        // Ζητάμε από τον χρήστη να εισάγει έναν αριθμό από 1 έως 7
        System.out.print("Παρακαλώ δώστε έναν αριθμό από το 1 έως το 7 για να δείτε την ημέρα της εβδομάδας: ");
        int dayNumber = scanner.nextInt();  // Αποθηκεύουμε την είσοδο του χρήστη στην μεταβλητή dayNumber

        // Χρησιμοποιούμε το switch για να ταιριάξουμε τον αριθμό με την αντίστοιχη ημέρα
        switch (dayNumber) {
            case 1:
                System.out.println("Δευτέρα");
                break;
            case 2:
                System.out.println("Τρίτη");
                break;
            case 3:
                System.out.println("Τετάρτη");
                break;
            case 4:
                System.out.println("Πέμπτη");
                break;
            case 5:
                System.out.println("Παρασκευή");
                break;
            case 6:
                System.out.println("Σάββατο");
                break;
            case 7:
                System.out.println("Κυριακή");
                break;
            default:
                System.out.println("Αυτός ο αριθμός δεν αντιστοιχεί σε καμία ημέρα της εβδομάδας.");
                break;
        }

        // Κλείνουμε τον Scanner
        scanner.close();
    }
}

