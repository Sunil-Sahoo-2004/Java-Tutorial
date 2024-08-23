package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {
   
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // It Implements Set Interface.
        // The underlying data structure for HashSet is Hashtable.
        // As it implements the Set Interface, duplicate values are not allowed.
        // NULL elements are allowed in HashSet.
        // HashSet also implements Serializable and Cloneable interfaces.
        // Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
        HashSet hs = new HashSet();

        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);


        // Contains unique elements only like HashSet. It extends the HashSet class and implements the Set interface.
        // The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
        // Maintains insertion order.
        LinkedHashSet hs1 = new LinkedHashSet();

        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);

        System.out.println(hs1);

    }
}
