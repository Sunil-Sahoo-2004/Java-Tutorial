import java.util.*;

public class Expection2 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = 0;
            int arr[] = new int[5];
            String str = null;
            try{
                b = 18/a;
                System.out.println(str.length());
                System.out.println(arr[0]);
                System.out.println(arr[5]);
            } catch(ArithmeticException e){
                System.out.println("Can not devive by zero..");
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is upper bounded");
            } catch(Exception e){
                System.out.println("Something Went Wromg");
            }
            System.out.println(b);
        }
        System.out.println("Byy");
    }
}
