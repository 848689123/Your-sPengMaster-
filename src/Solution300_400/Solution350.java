package Solution300_400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        for (int x : nums1) {
            if (!map.containsKey(x))
                map.put(x, 1);
            else {
                int n = map.get(x);
                map.put(x, n + 1);
            }
        }
        int count = 0;
        int nums[] = new int[nums2.length];
        for(int x : nums2){
            if(map.containsKey(x)){
                nums[count] = x;
                count++;
                int n = map.get(x);
                if(n==1)    map.remove(x);
                else map.put(x,n-1);
            }
        }
        return Arrays.copyOf(nums,count);
    }
}
