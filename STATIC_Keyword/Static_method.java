class Mobile{
    String brand;
    int prise;
    static String name;
 
    public void show(){
     System.out.println(brand + " : " + prise + " : " + name);
    }
    public static void show1(Mobile obj){
       System.out.println("Static Method");
       System.out.println(obj.brand + " : " + obj.prise + " : " + name);
    }
 }
public class Static_method {
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
        Mobile.name = "Tab";          

        Mobile.show1(obj1);
        Mobile.show1(obj2);
        Mobile.show1(obj3);
    }
}
