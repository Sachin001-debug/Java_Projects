import java.util.Scanner;

class Student {
    String name;
    int roll;
    float marks;

    // method to input data
    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter roll number:");
        roll = sc.nextInt();

        System.out.println("Enter marks:");
        marks = sc.nextFloat();
    }

    // method to display data
    void displayData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Roll  : " + roll);
        System.out.println("Marks : " + marks);
    }
}

public class qn1 {
    public static void main(String[] args) {
        Student s1 = new Student();  // creating object

        s1.inputData();
        s1.displayData();
    }
}