import java.util.*;
public class pp {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = 0;

        try{
            b = 18/a;
            if (b == 0) {
                throw new ArithmeticException("I don't want to print zero");
            }
        } catch(ArithmeticException e){
            b = 18 / 1;
            System.out.println("Thats an default output" + e);
        } catch(Exception e){
            System.out.println("Something went wrong" + e);
        }
        System.out.println(b);
    } 
            System.out.println("Byy");
    }
}




