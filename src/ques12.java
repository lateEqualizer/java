import java.util.Scanner;

public class ques12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your roll number: ");
        int roll = myScanner.nextInt();

        myScanner.nextLine();
        System.out.println("Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Please enter your nationality: ");
        String nationality = myScanner.nextLine();

        System.out.println("-------------------------------");
        System.out.println("Details Recorded: ");
        System.out.println("\tRoll Num: " + roll);
        System.out.println("\tName: "+ name);
        System.out.println("\tNationality: "+ nationality);

    }
}
