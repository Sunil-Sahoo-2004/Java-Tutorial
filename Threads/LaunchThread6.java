class printing implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Focus is Important");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
}
public class LaunchThread6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread started.......");

        printing p = new printing();

        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive()); // false

        t1.start();
        System.out.println(t1.isAlive()); // true
        t1.join();  // It confirm  that t1 complited its task

        System.out.println("Main Thread Finished its Work.........");
    }
}
