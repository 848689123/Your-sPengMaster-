package Solution300_400;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)    return true;
        int size = 0;
        for(int i=0;i<s.length();i++){
            if(t.charAt(size)==s.charAt(i)){
                size++;
            }
        }
        return size==s.length();
    }
}
