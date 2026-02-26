package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static ArrayList<ArrayList<String>> groupAnagram(String[] arr) {
        int n = arr.length;
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = arr[i];
 
            // sort 
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if (!mp.containsKey(sorted)) {
                mp.put(sorted, new ArrayList<>());
            }
            mp.get(sorted).add(arr[i]);
        }
        for (ArrayList<String> value : mp.values()) {
            ans.add(value);
        }
        return ans;
    }

    public static List<List<String>> groupAnagramOptimised(String[] arr) {
    HashMap<String, List<String>> mp = new HashMap<>();
    for(String str : arr){

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);

        mp.putIfAbsent(sorted, new ArrayList<>());
        mp.get(sorted).add(str);
    }

    return new ArrayList<>(mp.values());
}

    public static void main(String[] args) {
        String[] strArray = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(Arrays.toString(strArray));

        System.out.println(groupAnagram(strArray));
        System.out.println(groupAnagramOptimised(strArray));
    }
}
