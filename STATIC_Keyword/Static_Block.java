class Mobile{
    String brand;
    int prise;
    static String name;

    public Mobile(){
        brand = "";
        prise = 200;
        System.out.println("Static Constructor");
    }
    static{
        name = "phone";
        System.out.println("In Static Block");
    }
    public void show(){
        System.out.println(brand + " : " + prise + " : " + name);
    }
}
public class Static_Block {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Sumsung";
        // obj1.prise = 15000;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Iphone";
        // obj2.prise = 150000;
        // Mobile.name = "Apple";

        Class.forName("Mobile");    
    }
}
