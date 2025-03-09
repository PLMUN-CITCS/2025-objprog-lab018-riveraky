import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getIntegerInput(scanner);
        String result = checkEvenOrOdd(number);
        System.out.println(result);
        scanner.close();
    }

    public static int getIntegerInput(Scanner scanner) {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}