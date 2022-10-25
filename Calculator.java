import java.util.Objects; import java.util.Scanner;

public class Calculator { public static void main(String[] args) { Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a operator:");
    String operator = sc.nextLine();

    System.out.println("Please enter your first number:");
    double a = sc.nextDouble();

    System.out.println("Please enter your second number:");
    double b = sc.nextDouble();

    if (Objects.equals(operator, "+")) {
        System.out.println("The result of your operation is: " + (a + b));
    } else if (Objects.equals(operator, "-")) {
        System.out.println("The result of your operation is: " + (a - b));
    } else if (Objects.equals(operator, "/")) {
        System.out.println("The result of your operation is: " + (a / b));
    } else if (Objects.equals(operator, "*")) {
        System.out.println("The result of your operation is: " + (a * b));
    } else {
        System.out.println("You enter a invalid operator, please restart the program.");
    }
}
}