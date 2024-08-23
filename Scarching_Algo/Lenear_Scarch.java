import java.util.Scanner;
public class Lenear_Scarch {
    public static boolean implement_Scarch(int arr[], int key){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                k = 1;
            }
        }
        return k == 1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the elements of array : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            System.out.print("Eneter Element for Scarch : ");
            int key = sc.nextInt();

            if (implement_Scarch(arr, key)) {
                System.out.println("Element is heare");
            } else{
                System.out.println("Element not found!");
            }
        }
    }
}