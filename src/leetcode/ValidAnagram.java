package leetcode;

public class ValidAnagram {
    public static boolean validAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++; // freq[s1[i] - 'a']++;
            freq[s2.charAt(i) - 'a']--; // freq[s2[i] - 'a']--;
        }
        for(int val : freq){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "racecar";
        String str2 = "carrace";

        System.out.println(validAnagram(str1, str2));
        System.out.println(validAnagram("jar", "jam"));
    }
}
