// class NavinExpection extends Exception{
//     NavinExpection(String string){
//         super(string);
//     }
// }
class NavinExpection extends RuntimeException{
    NavinExpection(String string){
        super(string);
    }
}
public class castom_Expection {
   public static void main(String[] args) {
      int a = 20;
      int b = 0;
      try{
        b = 18/a;
        if (b == 0) {
            throw new NavinExpection("I did not want to print zero");
        }
      } catch(NavinExpection e){
        b = 18/1;
        System.out.println("This is a default output" + e);
      } catch(Exception e){
        System.out.println("Something went wrong" + e);
      }
      System.out.println(b);
      System.out.println("Byy");
   }
}