package Solution500_600;

import java.util.*;

public class Solution512 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("111", "222");
        map.put("333", "444");
    }
    public int findLUSlength(String a, String b) {
        return a.equals(b) ?  -1 : a.length() > b.length() ?  a.length() : b.length();
    }
}
