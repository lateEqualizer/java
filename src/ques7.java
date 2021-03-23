import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {

        Scanner cylinderScanner = new Scanner(System.in);
        System.out.println("Please enter the value for radius(r):");
        double r = cylinderScanner.nextDouble();

        System.out.println("Please enter the value for length(l):");
        double l = cylinderScanner.nextDouble();

        System.out.println("Volume is " + 22/7*r*r*l);
    }
}
