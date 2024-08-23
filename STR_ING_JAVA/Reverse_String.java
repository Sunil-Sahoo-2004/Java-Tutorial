import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder str = new StringBuilder("hello");
            for (int i = 0; i < str.length()/2; i++) {
                int front = i;
                int back = str.length() - 1 - i;     //5 - 1 - 0
                
                char frontChar = str.charAt(front);
                char backChar = str.charAt(back);

                str.setCharAt(front, backChar);
                str.setCharAt(back, frontChar);

            }
            System.out.println(str);
        }
    }
}
