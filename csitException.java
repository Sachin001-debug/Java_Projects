import java.util.Scanner;

import javax.swing.JFrame;

// Custom Exception
class CsitException extends Exception {
    public CsitException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter faculty: ");
        String faculty = sc.nextLine();

        try {
            if (!faculty.equalsIgnoreCase("CSIT")) {
                throw new CsitException("You are not from CSIT faculty.");
            }

            System.out.println("You are from CSIT faculty.");

        } catch (CsitException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}