import java.util.Scanner;

public class ques4 {
    public static void main(String [] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the value for Principal (P) amount: ");
        double p = myScanner.nextDouble();
        System.out.println("Please enter the value for Time (T): ");
        double t = myScanner.nextDouble();
        System.out.println("Please enter the Rate (R) of interest: ");
        double r = myScanner.nextDouble();

        double interest = p*t*r/100;

        System.out.println("-------------------------------");
        System.out.println("Interest amount = " + interest);


    }

}
