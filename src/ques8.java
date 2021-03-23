import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {

        System.out.println("Please select a converter below:");
        System.out.println("\t1. Celsius to Fahrenheit.");
        System.out.println("\t2. Fahrenheit to Celsius.");

        Scanner myScanner = new Scanner(System.in);
        String input;
        int choice;

        do {

            try {
                input = myScanner.next();
                choice = Integer.parseInt(input);

                if (choice < 1 || choice > 2) {
                    System.err.println("Bad Input! Please enter again.");
                }

            } catch (Exception e) {
                System.err.println("Invalid Input");
                choice = -1;

            }
        }while (choice <1 || choice >2);

        double value= 0;

        switch (choice){
            case 1:
                value = c2f();
                break;
            case 2:
                value = f2c();
                break;
        }

        System.out.println("Converted temperature is: "+value);

    }

    private static double f2c() {
        Scanner tempScanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Farenheit (f): ");
        double f = tempScanner.nextDouble();

        return (f-32)*5/9;
    }

    private static double c2f() {
        Scanner tempScanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius (c): ");
        double c = tempScanner.nextDouble();

        return (c*1.8)+32;
    }
}
