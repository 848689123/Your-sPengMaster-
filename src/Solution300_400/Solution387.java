package Solution300_400;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        char str[] = s.toCharArray();
        int nums[] = new int[26];
        for(int i = 0; i < nums.length; i++)
            nums[i] = 0;
        for(char ch : str)
            nums[ch - 'a']++;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == 1)
                set.add((char)(i + 'a'+1));
        for(int i = 0; i <str.length; i++)
            if(set.contains(str[i])) return i;
        return -1;
    }
}
