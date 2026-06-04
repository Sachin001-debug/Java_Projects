
//Write a program that reads data of employees from the keyboard and write it 
// into the file emp.doc using proper exception handling with try…catch blocks.


// Custom Exception
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Custom Exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class fileWritingExample {

    public fileWritingExample() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            if (name.isEmpty() || id.isEmpty()) {
                //custom exception if no field is entered
                throw new CustomException("All fields are required.");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("emp.doc"))) {

                writer.write("Employee Name: " + name);
                writer.newLine();
                writer.write("Employee ID: " + id);

                System.out.println("Employee data written successfully.");
            }

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        new fileWritingExample();
    }
}