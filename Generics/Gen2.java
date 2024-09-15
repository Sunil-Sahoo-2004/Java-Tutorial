package Generics;

import java.util.ArrayList;

class student1 {
    @SuppressWarnings("unused")
        private String name;
    @SuppressWarnings("unused")
        private int id;
}

class employe1 {
    @SuppressWarnings("unused")
        private String name;
    @SuppressWarnings("unused")
        private int id;
}

public class Gen2 {
    public static void main(String[] args) {
        student1 st1 = new student1();
        student1 st2 = new student1();

        ArrayList<student1> al1 = new ArrayList<student1>();
        Object f1 = al1.add(st1);
        Object f2 = al1.add(st2);

        System.out.println(f1);
        System.out.println(f2);
    }
}
