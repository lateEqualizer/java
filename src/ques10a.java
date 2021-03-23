import java.util.Scanner;

public class ques10a {
    public static void main(String[] args) {
        System.out.println("Please enter the value for u, t, and a separated by a space: ");
        Scanner myScanner = new Scanner(System.in);

        double u = myScanner.nextDouble();
        double t = myScanner.nextDouble();
        double a = myScanner.nextDouble();

        System.out.println("s = " + (u*t)+(0.5*a*t*t));

    }
}
