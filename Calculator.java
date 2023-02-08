import java.util.Scanner;

// this is to practice git and github so I'm not checking if the input is in the right form
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two whole numbers");

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        System.out.println("Would you like to add, subtract, multiply, or divide");

        scanner.nextLine(); // for the /n after .nextInt()
        String operation = scanner.nextLine();

        if (operation.equalsIgnoreCase("add")) {
            System.out.println(num1 + num2);
        } else if (operation.equalsIgnoreCase("subtract")) {
            System.out.println(num1 - num2);
        } else if (operation.equalsIgnoreCase("multiply")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }

    }
}