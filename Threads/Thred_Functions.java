class A extends Thread {
    private int count = 5;
    private static int Tcount = 0;

    A() {
        super("" + ++Tcount);
        start();
    }

    public void run() {
        while (true) {
            //System.out.println("Started " + Thread.currentThread());
            System.out.println("#" + getName() + " : " + count);
            if (--count == 0) {
                return;
            }
            //Thread.yield();
            //System.out.println("Ended " + Thread.currentThread());
        }
    }
}

public class Thred_Functions {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new A();
        }
    }
}
