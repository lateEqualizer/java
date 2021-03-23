import java.util.Scanner;

public class ques10b {
    public static void main(String[] args) {
        System.out.println("Please enter the value for s, a, b, and c separated by a space: ");
        Scanner myScanner = new Scanner(System.in);

        double s = myScanner.nextDouble();
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        double c = myScanner.nextDouble();

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("area = " + area);
    }
}
