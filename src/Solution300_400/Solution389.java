package Solution300_400;

public class Solution389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
    public static char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        int[] list = new int[26];
        for(int i = 0; i < 26; i++)
            list[i] = 0;
        int len = str1.length;
        for(int i = 0; i < len; i++){
            list[str1[i] - 'a']--;
            list[str2[i] - 'a']++;
        }
        list[str2[len] - 'a']++;
        for(int i = 0; i < 26; i++){
            if(list[i] == 1)
                return (char)(i+'a');
        }
        return 'a';
    }
}
