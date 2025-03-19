import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to classify: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        classifyNumber(number);

        scanner.close();
    }

    static void classifyNumber(int number) {
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
}
