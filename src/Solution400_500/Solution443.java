package Solution400_500;

import java.util.Arrays;

public class Solution443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{}));
    }
    public static int compress(char[] chars) {
        if(chars==null||chars.length==0)    return 0;
        int cnt = 0;
        for(int i = 0; i < chars.length; i++){
            int temp = 0;
            char ch = chars[i];
            chars[cnt] = chars[i];
            while(i < chars.length && ch == chars[i]){
                i++;
                temp++;
            }
            i--;
            cnt++;
            int cnt2 = cnt;
            if(temp != 1){
                if(temp > 9){
                    while(temp != 0){
                        chars[cnt] = (char)(temp % 10 + '0');
                        cnt++;
                        temp /= 10;
                    }
                }else{
                    chars[cnt] = (char)(temp + '0');
                    cnt++;
                }
            }
            int k = cnt2;
            for(int j = cnt - 1; j >= k; j--, k++){
                char t = chars[j];
                chars[j] = chars[k];
                chars[k] = t;
            }
        }
        return cnt;
    }
}
