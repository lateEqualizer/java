import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        int a,b;
        char op;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        a = myScanner.nextInt();

        System.out.println("Please enter second number: ");
        b = myScanner.nextInt();

        System.out.println("Please the operator: ");
        op = myScanner.next().charAt(0);
        int result;

        switch (op) {
            case '+' -> {
                result = a + b;
                System.out.print("Result is " + result);
            }
            case '-' -> {
                result = a - b;
                System.out.print("Result is " + result);
            }
            case '*' -> {
                result = a * b;
                System.out.print("Result is " + result);
            }
            case '/' -> {
                result = a / b;
                System.out.print("Result is " + result);
            }
            default -> System.out.println("Invalid Operator!");
        }

    }
}
