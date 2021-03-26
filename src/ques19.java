import java.util.Scanner;

public class ques19 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle");
        int firstSide = inputScanner.nextInt();


        System.out.println("Enter the second side of the triangle");
        int secondSide = inputScanner.nextInt();


        System.out.println("Enter the third side of the triangle");
        int thirdSide = inputScanner.nextInt();


        if ((firstSide == secondSide) && (secondSide == thirdSide))
        {
            System.out.println("It is an equilateral Triangle");
        }
        else if (firstSide == secondSide)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else if(!(secondSide == thirdSide))
        {
            System.out.println("It is a scalene triangle");
        }

    }
}
