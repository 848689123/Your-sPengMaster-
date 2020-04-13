import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        boolean flag = wordPattern2(pattern,str);
        if(flag) flag = wordPattern3(str,pattern);
        return flag;
    }
    public boolean wordPattern2(String pattern, String str) {
        Map<Character,String> map = new HashMap();
        String strs[] = str.split(" ");
        int patternLen = pattern.length();
        int strsLen = strs.length;
        if(patternLen!=strsLen) return false;
        for(int i=0; i<strsLen; i++){
            Character ch = pattern.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,strs[i]);
            else {
                String s = map.get(ch);
                if(!s.equals(strs[i]))
                    return false;
            }
        }
        return true;
    }

    /**
     * str代表字符串，pattern代表字符
     * @param str
     * @param pattern
     * @return
     */
    public boolean wordPattern3(String str, String pattern) {
        Map<String, Character> map = new HashMap();
        String strs[] = str.split(" ");
        int patternLen = pattern.length();
        int strsLen = strs.length;
        for(int i=0; i<strsLen; i++){
            String s = strs[i];
            Character ch = pattern.charAt(i);
            if(!map.containsKey(s))
                map.put(s,ch);
            else{
                Character ch2 = map.get(s);
                if(ch2!=ch) return false;
            }
        }
        return true;
    }
}
