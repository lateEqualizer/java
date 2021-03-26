public class ques28 {
    public static void main(String[] args) {

        int numero = 10;
        isPrimeNumber(numero);
        nthPrimeNumber(numero);
        allPrimeBetween(10,20);

    }


    public static void isPrimeNumber(int num){
        if (num % 2 == 0)
        {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("number is odd");
        }
    }

    public static void nthPrimeNumber(int number){
        int num, count, i;
        num=1;
        count=0;

        while (count < number){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);
    }

    public static void allPrimeBetween(int number1, int number2)
    {

        int i, j, flag;

        for (i = number1; i <= number2; i++) {

            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i);
        }
    }
}
