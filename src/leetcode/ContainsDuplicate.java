package leetcode;
import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(ArrayList<Integer> arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.size(); i++){
            if(set.contains(arr.get(i))){
                return true;
            }
            set.add(arr.get(i));
        }
        return false;
    }
    
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.println(containsDuplicate(arr));   
    }
}
