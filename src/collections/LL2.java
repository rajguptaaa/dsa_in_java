package collections;

import java.util.*;

public class LL2 {
    public static void reverseList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(10);
        // list.addFirst(20);
        // list.add(30);
        // list.addLast(40);
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.peekFirst());
        // System.out.println(list.peekLast());
        // list.removeFirst();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        reverseList(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    }
}
