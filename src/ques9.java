import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        System.out.println("Pound to Kg Converter");
        System.out.println("Please enter the value in pounds(lbs):");

        Scanner myScanner = new Scanner(System.in);
        double val =  myScanner.nextDouble();

        System.out.println(val+" pounds is "+val*0.454 + " kgs.");


    }
}
