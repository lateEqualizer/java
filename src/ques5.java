import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        System.out.println("Area Calculator");
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
                    System.out.println("Bad Input! Please enter again.");
                }

            } catch (Exception e) {
                System.err.println("Invalid Input");
                choice = -1;

            }
        }while (choice <1 || choice >3);

        double area = 0;
        switch (choice){
            case 1:
                area = calcuateCircle();
                break;
            case 2:
                area = calculateRectangle();
                break;
            case 3:
                area = calculateTriangle();
                break;
        }

        System.out.println("The area is " + area);
}

    private static double calculateTriangle() {
        Scanner triangleScanner = new Scanner(System.in);
        System.out.println("Please enter the value for height(h):");
        double h = triangleScanner.nextDouble();

        System.out.println("Please enter the value for base(b):");
        double b = triangleScanner.nextDouble();

        return 0.5 * b*h;


    }

    private static double calculateRectangle() {

        Scanner rectangleScanner = new Scanner(System.in);
        System.out.println("Please enter the value for length(l):");
        double l = rectangleScanner.nextDouble();

        System.out.println("Please enter the value for breadth(b):");
        double b = rectangleScanner.nextDouble();

        return l*b;
    }

    private static double calcuateCircle() {

        Scanner circleScanner = new Scanner(System.in);
        System.out.println("Please enter the value for radius(r):");
        double r = circleScanner.nextDouble();

        return 22*r*r/7;

    }


}
