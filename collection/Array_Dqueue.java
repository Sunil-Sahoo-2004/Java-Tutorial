package collection;

import java.util.ArrayDeque;

public class Array_Dqueue {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();

        // add
        ad1.add(100);
        ad1.add(200);
        System.out.println(ad1);

        // add_first and add_last
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);

        // We can also add dublicates
        ad1.add(200);
        System.out.println(ad1);

        // We can also add homoginous and heteroginous type of data
        ad1.add("pw");
        ad1.add(8.1);
        System.out.println(ad1);

        // We have also offer() method to add and delete data it work same as add() method
        ad1.offer(500);
        ad1.offerFirst(50);
        ad1.offerLast(70);
        System.out.println(ad1);
        // offer() does not ensure that your data added properly but add() method ensure that your data added properly
        
        //ArrayDqueue implement directly Dqueue interface which extended queue interface it internaly followed Double Ended Queue it ensure that You can add and delete data in both end
        //It is Dinamic in size
    }
}