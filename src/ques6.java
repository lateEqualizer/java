import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        System.out.println("Perimeter Calculator");
        System.out.println("Please select one: ");
        System.out.println("\t1. Circle.");
        System.out.println("\t2. Rectangle.");
        System.out.println("\t3. Triangle.");
        System.out.println("-----------------------");

        Scanner myScanner = new Scanner(System.in);
        String input;
        int choice;

        do {

            try {
                input = myScanner.next();
                choice = Integer.parseInt(input);

                if (choice < 1 || choice > 3) {
                    System.err.println("Bad Input! Please enter again.");
                }

            } catch (Exception e) {
                System.err.println("Invalid Input");
                choice = -1;

            }
        }while (choice <1 || choice >3);

        double perimeter= 0;

        switch (choice){
            case 1:
                perimeter = calcuateCircle();
                break;
            case 2:
                perimeter = calculateRectangle();
                break;
            case 3:
                perimeter = calculateTriangle();
                break;
        }

        System.out.println("The perimeter is " + perimeter);
    }

    private static double calculateTriangle() {
        Scanner triangleScanner = new Scanner(System.in);
        System.out.println("Please enter the length for side 1:");
        double a = triangleScanner.nextDouble();

        System.out.println("Please enter the length for side 2:");
        double b = triangleScanner.nextDouble();

        System.out.println("Please enter the length for side 3:");
        double c = triangleScanner.nextDouble();

        return a+b+c;


    }

    private static double calculateRectangle() {

        Scanner rectangleScanner = new Scanner(System.in);
        System.out.println("Please enter the value for length(l):");
        double l = rectangleScanner.nextDouble();

        System.out.println("Please enter the value for breadth(b):");
        double b = rectangleScanner.nextDouble();

        return 2*(l+b);
    }

    private static double calcuateCircle() {

        Scanner circleScanner = new Scanner(System.in);
        System.out.println("Please enter the value for radius(r):");
        double r = circleScanner.nextDouble();

        return 2*22*r/7;

    }


}
