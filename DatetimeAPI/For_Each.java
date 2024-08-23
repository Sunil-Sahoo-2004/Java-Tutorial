package DatetimeAPI;

import java.util.*;
import java.util.function.Consumer;

public class For_Each {
    public static void main(String[] args) {
        // Creating Collection One type
           // List<Integer> list1 = new ArrayList<Integer>();
           // list1.add(2);
           // list1.add(3);
           // list1.add(4);
           // list1.add(5);
           // list1.add(6);
           // list1.add(7);
           // System.out.println(list1);

        // Creating Collection another type
           List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6, 7);
           System.out.println(list2);

             // Use Loop to print the ArrayList Elements
                 // Heare we use Object Datatype it is Type casted into Integer Datatype
                       // for (Object o : list2) {
                       //     System.out.println(o);
                       // }
          
                 // Heare we use Intiger Datatype Because it is alredy define in Integer Datatype
                       // for (Integer i : list2) {
                       //     System.out.println(i);
                       // }
     
             // Uaing Predefine method 'ForEach()'
                    // That is Annanomas Innerclass Method To access the Each element of the ArrayList
                       // list2.forEach(n -> System.out.println(n));
   
                    // Defining Consumer Body to Access the ArrayList Element **That type of function is called Annanomus Function**
                       // Consumer<Integer> cons = new Consumer<Integer>() {
                       //    @Override
                       //    public void accept(Integer i){
                       //        System.out.println(i);
                       //    }
                       // };
                       // list2.forEach(cons);

                    // Use Lamda Method in Consumer Body
                       Consumer<Integer> cons=i -> System.out.println(i);
                       list2.forEach(cons);
    }
}
