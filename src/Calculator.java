import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers, pressing return after each:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = 0d;
        System.out.println("Enter an operator (+, -, *, /)");
        String op = scanner.next();
        while (!Objects.equals(op, "+") && !op.equals("-") && !op.equals("*") && !Objects.equals(op, "/")) {
            System.out.println("Not valid. Enter an operator (+, -, *, /)");
            op = scanner.next();
        }
        if (Objects.equals(op, "+")) {
            result = num1 + num2;
        } else if (Objects.equals(op, "-")) {
            result = num1 - num2;
        } else if (Objects.equals(op, "*")) {
            result = num1 * num2;
        } else if (Objects.equals(op, "/")) {
            result = (double) num1 / num2;
        } else {
            System.out.println("not a valid operator");
        }
        System.out.println(result);
    }
}
