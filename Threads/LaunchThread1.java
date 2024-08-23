class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread Calling.....");
    }
}
public class LaunchThread1 {
    public static void main(String[] args) {
        System.out.println("Maim Thread");

        System.out.println("Before Changing : ");
        String name1 = Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println(Thread.currentThread().getPriority());

        System.out.println();

        System.out.println("After Changing : ");
        Thread t = Thread.currentThread();
        t.setName("Babu");
        t.setPriority(1);

        String name2 = Thread.currentThread().getName();
        System.out.println(name2);
        System.out.println(Thread.currentThread().getPriority());

        MyThread t2 = new MyThread();
        t2.start();
    }
}
