public class ques34 {
    static void reverse(int a[], int n){

        int[] array = new int [n];
        int j = n;

        for (int i = 0; i < n; i++){
            array[j-1] = a[i];
            j = j-1;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(array[k]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}
