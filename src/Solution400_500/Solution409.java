package Solution400_500;

public class Solution409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        char str[] = s.toCharArray();
        int list[] = new int[26];
        int list2[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = str[i];
            if(ch >= 'a' && ch <= 'z') list[str[i] - 'a']++;
            if(ch >= 'A' && ch <= 'Z') list2[str[i] - 'A']++;
        }
        int max = 0;
        int result = 0;
        for(int n : list){
            if(n % 2 == 0) result += n;
            else {
                if(max < n){
                    if(max != 0) result += max - 1;
                    max = n;
                } else result += n - 1;
            }
        }
        for(int n : list2){
            if(n % 2 == 0) result += n;
            else {
                if(max < n){
                    if(max != 0) result += max - 1;
                    max = n;
                } else result += n - 1;
            }
        }
        return result + max;
    }
}
