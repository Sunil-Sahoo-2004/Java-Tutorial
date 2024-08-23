import java.util.*;

class MyThread1 extends Thread{
    public void run(){
       String tName = Thread.currentThread().getName();

       if (tName.equals("Calc")) {
         calc();
       } else{
        importantMessage();
       }
    }
    public void calc(){
        System.out.println("Calculation Task Started..........");
           try (Scanner sc = new Scanner(System.in)) {
               System.out.print("Enter the First Number : ");
               int num1 = sc.nextInt();
   
               System.out.print("Enter The Second Number : ");
               int num2 = sc.nextInt();
               
               int res = num1 + num2;
   
               System.out.println(res);
           }
        System.out.println("Calculation Task Ended............");
    }
    public void importantMessage(){
        System.out.println("Displaying important message task start........");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focous is important to master skills");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem Occer");
        }
        System.out.println("Displaying important message task end..........");
    }
}

public class LaunchThread4 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started..........");

        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("Calc");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
}
