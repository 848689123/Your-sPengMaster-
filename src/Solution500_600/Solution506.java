package Solution500_600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution506 {
    public static void main(String[] args) {
        System.out.println(findRelativeRanks(new int[]{5,2,99,33,87,45}));
    }
    public static String[] findRelativeRanks(int[] nums) {
        int nums2[] = nums.clone();
        Arrays.sort(nums);
        String[] strs = new String[nums.length];
        Map<Integer, String> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(i == 0)  map.put(nums[i], "Gold Medal");
            else if(i == 1)  map.put(nums[i], "Silver Medal");
            else if(i == 2)  map.put(nums[i], "Bronze Medal");
            else map.put(nums[i], i + 1 + "");
        }
        for(int i = 0; i < nums.length; i++){
            strs[i] = map.get(nums2[i]);
        }
        return strs;
    }

}
