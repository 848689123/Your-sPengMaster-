package Solution100_300;

import java.util.HashMap;
import java.util.Map;

public class Solution299 {
    public static void main(String[] args) {
        String s =getHint("1123", "0111");
        System.out.println(s);
    }

    public static String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap<>();
        int bull = 0;
        int cow = 0;
        for(int i=0; i<secret.length(); i++){
            map.putIfAbsent(secret.charAt(i),0);
            map.put(secret.charAt(i), map.get(secret.charAt(i)) + 1);
            if(secret.charAt(i) == guess.charAt(i)){
                bull += 1;
            }
        }
        for(int i=0; i<guess.length(); i++){
            if(map.getOrDefault(guess.charAt(i), -1) > 0 ){
                cow += 1;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        return bull+"A"+(cow-bull)+"B";
    }
}
