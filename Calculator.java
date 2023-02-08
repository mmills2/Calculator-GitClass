import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two whole numbers");

        // this is to practice git and github so I'm not checking if the input is in the
        // right form
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);
    }
}