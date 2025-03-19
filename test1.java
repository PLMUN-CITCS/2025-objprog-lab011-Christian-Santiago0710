import java.util.Scanner;

public class NumberClassifierMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    classifyNumber(scanner);
                    break;
                case 2:
                    printMultiplicationTable(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }

            if (option != 3) {
                System.out.print("Do you want to return to the menu? (Y/N): ");
                choice = scanner.nextLine().toUpperCase().charAt(0);
            } else {
                choice = 'N'; //Exit the loop if the user chooses to exit
            }

        } while (choice == 'Y');

        scanner.close();
    }

    static void displayMenu() {
        System.out.println("=== Number Classifier Menu ===");
        System.out.println("1. Classify a number as positive, negative, or zero");
        System.out.println("2. Print a multiplication table for a given number");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    static void classifyNumber(Scanner scanner) {
        System.out.print("Enter a number to classify: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
            if (number % 2 != 0) {
                System.out.println("It is an odd number.");
            } else {
                System.out.println("It is an even number.");
            }
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    static void printMultiplicationTable(Scanner scanner) {
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
