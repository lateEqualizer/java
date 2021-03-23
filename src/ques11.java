public class ques11 {
    public static void main(String[] args) {
        int a =11;
        int b =5;

        System.out.println("Before swap :  a = "+a+" b= "+b);
        swapWithTemp(a,b);
        swapWithoutTemp(a,b);

    }

    private static void swapWithoutTemp(int a, int b) {
        System.out.println("Swapping without temp.");
        a = a-b;
        b = b+a;
        a = b-a;
        System.out.println("After swap :  a = "+a+" b= "+b);
    }

    private static void swapWithTemp(int a, int b) {
        System.out.println("Swapping with temp.");
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap :  a = "+a+" b= "+b);

    }
}
