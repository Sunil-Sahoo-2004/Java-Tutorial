import java.util.*;
public class Expection1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
             int b = 0;
             try{
                  b = 18/a;
             } catch(Exception e){
                System.out.println("Something Went wrong !....");
             }
             System.out.println(b);
        }
         
    }
}
