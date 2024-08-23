class Human{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Sunil");
        obj.setAge(20);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

// Encuplation means hide all the details in a block you only axis all the data through the method 