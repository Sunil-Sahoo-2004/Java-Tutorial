class A{
     A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In a show");
    }
}
public class Ananomas_Object {
    public static void main(String[] args) {
        new A();       //this object is called ananomas object
        new A().show();     //Every time it create a new object
        new A().show();
    }
}
