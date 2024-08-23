import java.util.Scanner;
public class Selection_Short {
    public static void implement_srlection_short_algo(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print_arr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
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
            implement_srlection_short_algo(arr);
            System.out.print("Array after implement babule short : ");
            print_arr(arr);
        }
    }
}
