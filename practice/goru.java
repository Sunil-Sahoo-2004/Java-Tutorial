
class Pyramid1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Pyramid2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class goru {
    public static void main(String[] args) {
        Pyramid1 obj1 = new Pyramid1();
        Pyramid2 obj2 = new Pyramid2();
        try {
            obj1.start();
            obj1.join(); // Wait for obj1 to finish before starting obj2
            obj2.start();
            Thread.sleep(10);
            Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
