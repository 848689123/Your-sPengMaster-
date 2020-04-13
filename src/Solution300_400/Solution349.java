package Solution300_400;

import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for (int x : nums1){
            if(!set.contains(x))
                set.add(x);
        }
        Set<Integer> set2 = new HashSet();
        for(int x : nums2){
            if(set.contains(x)){
                set2.add(x);
            }
        }
        Integer nums3[] = set2.toArray(new Integer[set2.size()]);
        int nums4[] = new int[nums3.length];
        for(int i = 0; i < nums3.length; i++)
            nums4[i] = nums3[i].intValue();
        return nums4;
    }
}
