class A extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " i = " + i);
                Thread.sleep(1000); 
            }
            System.out.println(getName() + " Finishes");
        } catch(InterruptedException e){
            System.out.println("Error" + e);
        }
    }
}
class B extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " i = " + i);
                Thread.sleep(900);
            }
            System.out.println(getName() + " Finishes");
        } catch(InterruptedException e){
            System.out.println("Error" + e);
        }
    }
}
class C extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " i = " + i);
                Thread.sleep(800);
            }
            System.out.println(getName() + " Finishes");
        } catch(InterruptedException e){
            System.out.println("Error" + e);
        }
    }
}
public class Multiple_Thread_2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj1.setName("Thred A");
        obj2.setName("Thred B");
        obj3.setName("Thred C");

        obj1.start();
        obj2.start();
        obj3.start();
    }  
}
