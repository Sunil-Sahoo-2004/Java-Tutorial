import java.util.Scanner;
public class StringBuilder_class {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        StringBuilder str = new StringBuilder("Tony");
        System.out.println(str);

        //get element
        System.out.println(str.charAt(0));

        //set element
        str.setCharAt(0,  'p');
        System.out.println(str);

        //insert element
        str.insert(0, 'T');
        System.out.println(str);

        //Delite element
        str.delete(1, 2);
        System.out.println(str);
        
        System.out.println();
        System.out.println();
        //append
        StringBuilder str1 = new StringBuilder("h");     
                                   //same task if i want to do using String class then we write 
                                       //str1 = str1 + "e";
                                       //str1 = str1 + "l";
                                       //str1 = str1 + "l";
                                       //str1 = str1 + "o";
                                   //Every time we create a new string and it take more time than StringBuilder Class
        str1.append("e");
        str1.append("l");
        str1.append("l");
        str1.append("o");

        System.out.println(str1);

        //length()
        System.out.println(str1.length());

        //capacity()
        System.out.println(str1.capacity());

        
     }  
   } 
}
