package Solution500_600;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word))   return true;
        if(word.toLowerCase().equals(word))   return true;
        if((word.charAt(0) >= 'A') && (word.charAt(0) <= 'Z') && word.substring(1).toLowerCase().equals(word.substring(1)))
            return true;
        return false;
    }
}
