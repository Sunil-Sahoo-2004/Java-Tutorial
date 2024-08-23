import java.util.Scanner;
public class Babule_short {
    public static void implement_babule_short_algo(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print_arr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.print("Enter the element of array : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Array Eleents are : ");
            print_arr(arr);
            System.out.println();
            implement_babule_short_algo(arr);
            System.out.print("Array after implement babule short : ");
            print_arr(arr);
        }
    }
}