package collection;

import java.util.TreeSet;

public class Tree_Set {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // The TreeSet class of the Java collections framework provides the functionality of a tree data structure.
        //It extends the NavigableSet interface.
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);   
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        // Add same type of data but it does not consider duplicates value
        // ts.add(100);
        // System.out.println(ts);

        // find higher value than any value
        System.out.println(ts.higher(50));  // it provide the upper value evrey time dosent matter value is prasent in the TreeSet or not
        System.out.println(ts.ceiling(50)); // it provide the upper value if the object is not present in the TreeSet

        // find higher value than any value
        System.out.println(ts.lower(40));   // it provide the lower value evrey time dosent matter value is prasent in the TreeSet or not
        System.out.println(ts.floor(50));   // it provide the lower value if the object is not present in the TreeSet

    }
}
