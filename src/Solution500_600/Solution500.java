package Solution500_600;

import java.util.Arrays;

public class Solution500 {
    public String[] findWords(String[] words) {
        int cnt = 0;
        String str[] = new String[words.length];
        String str1 = "qwertyuiopQWERTYUIOP";
        String str2 = "asdfghjklLKJHGFDSA";
        String str3 = "ZXCVBNMmnbvcxz";
        for(String word : words){
            int i = str1.indexOf(word.charAt(0));
            String str4 = str1;
            if(i == -1){
                i = str2.indexOf(word.charAt(0));
                if(i == -1) str4 = str3;
                else str4 = str2;
            }
            boolean flag = true;
            for(int j = 0; j < word.length(); j++){
                if(str4.indexOf(word.charAt(j)) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag)
                str[cnt++] = str4;
        }
        return Arrays.copyOf(str,cnt-1);
    }
}
