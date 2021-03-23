import java.util.Scanner;

public class ques3 {
    public static void main(String [] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int num1 = obj1.nextInt();

        System.out.println("Enter the second value: ");
        int num2 = obj1.nextInt();

        int sum = num1+num2;
        float avg = (float)sum/2;

        System.out.println("Sum of the two numbers is " + sum);
        System.out.println("Average of the two numbers is " + avg);

    }
}
