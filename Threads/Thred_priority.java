class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Thred_priority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //System.out.println(obj1.getPriority());

        // obj2.setPriority(1);    //lowest
        // obj2.setPriority(10);   //highest
        // obj2.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try{
            Thread.sleep(5);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();
    }
}