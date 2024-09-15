package Generics;

import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        // type Sefty
            // String arr[] = new String[10];

            // arr[0] = "Sunil";
            // arr[1] = "Sahoo";
            // arr[3] = 10;

        // No Typesefty
            // ArrayList al1 = new ArrayList();

            // al1.add("Sunil");
            // al1.add("Sahoo");
            // al1.add(10);

            // String f1 = (String)al1.get(0);
            // String f2 = (String)al1.get(1);
            // String f3 = (String)al1.get(2);

            // System.out.println(f1);
            // System.out.println(f2);
            // System.out.println(f3);

        // Typesefty achived through Generics
            ArrayList<String> al1 = new ArrayList<String>();

            al1.add("Sunil");
            al1.add("sahoo");
            // al1.add(10);

            String f1 = al1.get(0);
            String f2 = al1.get(1);

            System.out.println(f1);
            System.out.println(f2);
    }
}
