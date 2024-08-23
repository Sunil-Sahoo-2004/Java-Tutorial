import java.util.*;

class calc extends Thread{
    @Override
    public void run(){
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
}
class Message extends Thread{
    @Override
    public void run(){
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

public class LaunchThread2 {
    public static void main(String[] args) {
        calc t1 = new calc();
        Message m1 = new Message();

        t1.start();
        m1.start();
    }
}
