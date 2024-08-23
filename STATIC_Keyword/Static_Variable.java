class Mobile{
   String brand;
   int prise;
   static String name;

   public void show(){
    System.out.println(brand + " : " + prise + " : " + name);
   }
}
public class Static_Variable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Sumsung";
        obj1.prise = 15000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.prise = 150000;
        Mobile.name = "Apple";

        Mobile obj3 = new Mobile();
        obj3.brand = "Xomi";
        obj3.prise = 40000;
        Mobile.name = "Tab";          //all the name is Tab because i declare the variable in static method thats why when once change the value than it change the value in all the object

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
