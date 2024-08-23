class JPS extends Thread{
    JPS(String str){
     super(str);
     start();
    }
    public void run(){
     try{
       System.out.println("Hello1 form Thread " + getName());
       Thread.sleep(500);
       System.out.println("Hello2 form Thread " + getName());
     } catch(InterruptedException e){
        System.out.println("Error" + e);
     }
    }
 }

public class JOIN_Thread {
    public static void main(String[] args) throws InterruptedException {
        new JPS("First").join();
        new JPS("Second").join();
        new JPS("Third").join();
    }
}
