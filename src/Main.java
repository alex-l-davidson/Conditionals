import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers, pressing return after each:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if ( num1 > num2 ) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        System.out.println("Enter another number, then press return:");
        int num3 = scanner.nextInt();
        if ( num3 % 2 == 0 ) {
            System.out.println("It is even!");
        } else {
            System.out.println("It is odd!");
        }

        System.out.println("Enter a colour: ");
        String colour = scanner.nextLine();
        System.out.println(colour);
        if (Objects.equals(colour, "green")) { //== did not work here, used IntelliJ suggestion
            System.out.println("green means go");
        } else if (Objects.equals(colour, "yellow")) {
            System.out.println("yellow means slow");
        } else if (Objects.equals(colour, "red")) {
            System.out.println("red means STOP STOP STOP!");
        } else {
            System.out.println("not a traffic light colour");
        }

        System.out.println("Enter a number between 1 and 12: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a valid month");
                break;
        }







    }
}