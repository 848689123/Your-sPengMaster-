package Solution300_400;

public class Solution345 {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int len =str.length;
        int k = 0;
        int l = len-1;
        while(k <= l){
            boolean flag = false;
            for(; k < len && k <= l; k++)
                if(check(str[k]))
                    break;
            for(; l > -1 && k <= l; l--)
                if(check(str[l])){
                    flag = true;
                    break;
                }
            if(flag){
                char t = str[k];
                str[k] = str[l];
                str[l] = t;
                k++;
                l--;
            }
        }
        return new String(str);
    }

    public boolean check(char ch){
        if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
            return false;
        return true;
    }
}
