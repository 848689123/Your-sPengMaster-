package Solution500_600;

import java.util.HashSet;
import java.util.Set;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet();
        for(int num : candies)
            set.add(num);
        int len = candies.length;
        return set.size()>len/2?len/2:set.size();
    }
}
