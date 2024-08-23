import java.util.Scanner;

public class Binary_Scarch {

    public static boolean Implement_Scarch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int k = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                k = 1;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k == 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // input size
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();

            // input array element
            int[] arr = new int[n];
            System.out.print("Enter the Element of array : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println();

            // output
            System.out.print("Your array elements are : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            System.out.println();

            // input element to find
            System.out.print("Enter the key element to find : ");
            int key = sc.nextInt();

            System.out.println();
            System.out.println();

            // scarch
            if (Implement_Scarch(arr, key)) {
                System.out.println("Element is heare");
            } else {
                System.out.println("Element not found !");
            }
        }
    }
}
