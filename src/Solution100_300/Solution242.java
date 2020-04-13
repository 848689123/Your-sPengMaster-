import java.util.Arrays;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        char []str1 = s.toCharArray();
        char []str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.toString(str1).equals(Arrays.toString(str2));
    }
}
