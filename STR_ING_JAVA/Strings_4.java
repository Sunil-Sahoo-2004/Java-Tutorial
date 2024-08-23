import java.util.Scanner;
public class Strings_4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // compareTo()
              // It chack three casses
              // 1. s1 > s2 return a poseative value
              // 2. s1 == s2 return 0
              // 3. s1 < s3 retur a negative(-ve) value
  
              String name1 = "Tony";
              String name2 = "Tony";
      
              if (name1.compareTo(name2) == 0) {
                System.out.println("Strings are equal");
              } else {
                System.out.println("Strings are not equal");
              }

            // equals()
              if (name1.equals(name2)) {
                System.out.println("Strings are equal");
              } else {
                System.out.println("Strings are not equal");
              }

            // ==
            // DO NOT USE == to check for string equality
            // Gives correct answer here
              if (name1 == name2) {
                System.out.println("Strings are equal");
              } else {
                System.out.println("Strings are not equal");
              }
        
            // Gives incorrect answer here
              if (new String("Tony") == new String("Tony")) {
                System.out.println("Strings are equal");
              } else {
                System.out.println("Strings are not equal");
              }

        }
    }
}
