package Solution500_600;

public class Solution557 {
    public String reverseWords(String s) {
        String strs[] = s.split(" ");
        String s1 = null;
        for(String str : strs){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            s1 += sb.toString();
        }
        return s1.trim();
    }
}
