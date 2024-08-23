class Human{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    // public void setName(String name, Human obj1) {                      // to solve this problem to creating new object we use "this" keyword 
    //     obj1.name = name;
    // }
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
public class this_keyword {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.setName("Sunil", obj);
        obj.setName("Sunil");
        obj.setAge(20);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
