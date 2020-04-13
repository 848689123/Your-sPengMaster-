package Solution300_400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap();
        char[] str1 = ransomNote.toCharArray();
        char[] str2 = magazine.toCharArray();
        for (char ch : str2) {
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else {
                int n = map.get(ch);
                map.put(ch, n + 1);
            }
        }
        for(char x : str1){
            if(map.containsKey(x)){
                int n = map.get(x);
                if(n==1)    map.remove(x);
                else map.put(x,n-1);
            }else return false;
        }
        return true;
    }
}
