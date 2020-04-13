package Solution300_400;

public class Solution344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        for( ;i <= j; i++, j--){
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
