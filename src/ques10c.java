import java.util.Scanner;

public class ques10c {
    public static void main(String[] args) {
        System.out.println("Please enter the value for a, b, and c separated by a space: ");
        Scanner myScanner = new Scanner(System.in);

        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        double c = myScanner.nextDouble();

        double check = (b*b)-(4*a*c);
        if(check < 0){
            System.err.println("Imaginary value. Cannot compute.");
            return;
        }
        else{
            double x = (Math.sqrt(check) - b)/(2*a);
            System.out.println("x = " + x);
        }


    }
}
