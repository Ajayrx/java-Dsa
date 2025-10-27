import java.util.Scanner;

public class StudentMarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Ask user whether to continue
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Enter 1 or 0.");
            }

        } while (choice != 0); // repeat until user enters 0

        System.out.println("Program terminated. Thank you!");
        sc.close();
    }
}
