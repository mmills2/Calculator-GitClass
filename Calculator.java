import java.util.Scanner;

// this is to practice git and github so I'm not checking if the input is in the right form
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two whole numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Would you like to add or subtract");

        scanner.nextLine(); // for the /n after .nextInt()
        String operation = scanner.nextLine();

        if (operation.equalsIgnoreCase("add")) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 - num2);
        }
    }
}