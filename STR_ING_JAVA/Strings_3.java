import java.util.Scanner;
public class Strings_3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String first_name = "Sunil";
            String last_name = "Sahoo";
            String full_name = first_name + "@" + last_name;
            
         // charAt()
            for (int i = 0; i < full_name.length(); i++) {
            System.out.println(full_name.charAt(i));
      }
        }
    }
}
