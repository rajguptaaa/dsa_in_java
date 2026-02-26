package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentelements {
    public static ArrayList<Integer> topKFrequentelements(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            if (!freq.containsKey(num)) {
                freq.put(num, 0);
            }
            freq.put(num, freq.get(num) + 1);
        }
        ArrayList<int[]> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            ans.add(new int[]{e.getValue(), e.getKey()});
        }
        Collections.sort(ans, (a,b) -> b[0] - a[0]);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<k; i++){
            res.add(ans.get(i)[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        int k = 2;
        System.out.println(topKFrequentelements(arr, k));
    }
}
