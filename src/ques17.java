import java.util.Scanner;

public class ques17 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int year = inputScanner.nextInt();
        boolean leap;

        if (year % 4 == 0) {
            if (year % 100 == 0) {

                leap = year % 400 == 0;
            }
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
