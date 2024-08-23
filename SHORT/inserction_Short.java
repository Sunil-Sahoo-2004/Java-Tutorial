import java.util.Scanner;
public class inserction_Short {
    public static void implement_insertion_sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //Finding out the currect possition to insurt
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
           //insertion
           arr[prev+1] = curr;
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

            int arr[] = new int[n];
            System.out.print("Enter the elements of array : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Array Eleents are : ");
            print_arr(arr);
            System.out.println();
            System.out.print("Array after implement shoting : ");
            implement_insertion_sort(arr);
            print_arr(arr);
        }
    }
}







