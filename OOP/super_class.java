class A{
   public A(){
      super();
      System.out.println("Call default constructor A");
   }
   public A(int n){
      super();
      System.out.println("Call perametrarize constructor A");
   }
}
class B extends A{
   public B(){
    super();
    System.out.println("Call default constructor B");
   }
   public B(int n){
    super();                
    System.out.println("Call perametrarize constructor B");
   }
}
public class super_class {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B obj1 = new B();
    }
}
