package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr); // [10, 20, 30]

        System.out.println(arr.get(1)); //20

        arr.add(1, 15); //add new element
        System.out.println(arr); //[10, 15, 20, 30]

        arr.set(0, 5); //replace/update 
        System.out.println(arr); //[5, 15, 20, 30]

        arr.remove(0); //delete
        System.out.println(arr); //[15, 20, 30]

        int size = arr.size();
        System.out.println(size); //3

        arr.add(1);
        arr.add(16);
        Collections.sort(arr); 
        System.out.println(arr);
    }
}
