package DatetimeAPI;

import java.util.*;
import java.util.stream.*;

public class Streim_API {
    public static void main(String[] args) {
        // Creating Collection
            List<Integer> list = Arrays.asList(8, 4, 5, 8, 9);
        // Creating Stream
            Stream<Integer> streamData = list.stream();


        //Yoy can work with stream data only once if you try to work with stream data twice then it throw exception
            // streamData.forEach(i -> System.out.println(i));
            // streamData.forEach(i -> System.out.println(i));



// Operation Performing

// 1)
        // Count Number of Element in the Stream
            // long count = streamData.count();
            // System.out.println(count);
// 2)
        // Filter Stream Data
            // Stream<Integer> filterStream = streamData.filter(n -> n%2==0);
        // Sort the Stream Element
            // Stream<Integer> sortedStream =  filterStream.sorted();
            // sortedStream.forEach(n -> System.out.println(n));
        // Perform operation with each element in the stream by creating new Steam
            // Stream<Integer> mapStream =  sortedStream.map(n -> n*2);
            // mapStream.forEach(n -> System.out.println(n));

// Or
            Stream<Integer> finalStream = streamData.filter(n -> n%2==0).sorted().map(n -> n*2);
            finalStream.forEach(n -> System.out.println(n));
            
    }
}
