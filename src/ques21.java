import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week :");
        int day = inputScanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is monday");
            case 2 -> System.out.println("It is tuesday");
            case 3 -> System.out.println("It is wednesday");
            case 4 -> System.out.println("It is thursday");
            case 5 -> System.out.println("It is friday");
            case 6 -> System.out.println("It is saturday");
            case 7 -> System.out.println("It is sunday");
            default -> System.out.println("Please enter valid number (0-7)");
        }
    }
}
