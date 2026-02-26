package leetcode;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] arr, int k){
        // int size = arr.length;
        // for(int i=0; i<size; i++){
        //     for(int j = i+1; j<size; j++){
        //         if(arr[i] + arr[j] == k){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{0};

        HashMap<Integer, Integer> mp = new HashMap<>();
        int size = arr.length;
        for(int i=0; i<size; i++){
            int rem = k - arr[i];
            if(mp.containsKey(rem)){
                return new int[]{mp.get(rem), i};
            }
            mp.put(arr[i], i);
        }
        return new int[]{};

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(twoSum(nums,6)));

        sc.close();
    }
}
