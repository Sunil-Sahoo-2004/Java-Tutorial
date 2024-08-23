import java.util.Scanner;
public class Strings_5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // substring(beginningIndex, EndingIndex)
           String Sentence = "My name is Tony";
           String name = Sentence.substring(11, Sentence.length());
           System.out.println(name);
        }
    }
}