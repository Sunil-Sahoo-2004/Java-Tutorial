import java.util.*;

class A extends Thread {
    private int start;
    private int end;
    private int sumEven;

    public A(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        sumEven = demo.isEven(start, end);
    }

    public int getSumEven() {
        return sumEven;
    }
}

class B extends Thread {
    private int start;
    private int end;
    private int sumOdd;

    public B(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        sumOdd = demo.isOdd(start,end);
    }

    public int getSumOdd() {
        return sumOdd;
    }
}

public class demo {
    public static int isEven(int start, int end) {
        int sumEven = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        return sumEven;
    }


    public static int isOdd(int start, int end) {
        int sumOdd = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the range of numbers (start and end): ");
            int start = sc.nextInt();
            int end = sc.nextInt();

            A obj1 = new A(start, end);
            B obj2 = new B(start, end);

            obj1.start();
            obj2.start();

            try {
                obj1.join();
                obj2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Sum of even numbers: " + obj1.getSumEven());
            System.out.println("Sum of odd numbers: " + obj2.getSumOdd());
        }
    }
}
