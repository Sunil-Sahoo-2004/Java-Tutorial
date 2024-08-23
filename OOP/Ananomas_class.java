interface Name{
    String name = "Sunil";
    void getName();
}
public class Ananomas_class {
    public static void main(String[] args) {
        Name n1 = new Name() {
            @Override
            public void getName(){
                System.out.println("My name is : " + name);
            }
        };

        n1.getName();
    }
}
