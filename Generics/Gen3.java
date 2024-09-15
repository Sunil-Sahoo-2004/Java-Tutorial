package Generics;

import java.util.*;

class Gen<T> {
    T obj;

    public Gen(T obj){
        this.obj = obj;
    }
    void disp(){
        System.out.println("Type of data is : " + obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }

}

public class Gen3 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(10);

        g.disp();
        System.out.println(g.getObj());

        // ArrayList<Gen> list5 = new ArrayList<Gen>();

        // ArrayList<String> list1 = new ArrayList<String>();

        // List<String> list2 = new ArrayList<String>();

        @SuppressWarnings("unused")
        Collection<Integer> list3 = new ArrayList<Integer>();

        // COMPILER ERROR
        // List<Object> list4 = new ArrayList<Integer>();   




    }
}
