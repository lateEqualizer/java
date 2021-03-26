import java.util.Scanner;

public class ques29 {

    static int factorial(int n){
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Please enter the value of n: ");
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int sum = 0;

        for(int i=0;i<n;i++){
            int num = i+1;
            int den = factorial(i+1);

            int term = num/den;
            sum = sum + term;
        }

        System.out.println("Result is "+ sum);
    }
}
