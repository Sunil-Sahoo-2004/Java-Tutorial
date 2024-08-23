import java.util.Scanner;
public class Strings_2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String first_name = "Sunil";
            String last_name = "Sahoo";
            String full_name = first_name + "@" + last_name;
            System.out.println(full_name);
      
            // length()
            System.out.println(full_name.length());
        }
    }
}
