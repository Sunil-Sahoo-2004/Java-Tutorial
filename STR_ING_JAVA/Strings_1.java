import java.util.Scanner;

public class Strings_1 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // nextLine()
        System.out.print("Enter name : ");
        String namew1 = sc.nextLine(); // It will print the full name
        System.out.println(namew1);

      // next()
       // System.out.print("Enter name : ");
       // String name = sc.next(); //It will print only the first word of the string
       // System.out.println(name);
    }
  }
}
