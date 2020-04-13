import java.util.HashSet;
import java.util.Set;

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if(length<=1) return false;
        Set<Integer> set = new HashSet();
        for(int i=0; i<length; i++){
            if(!set.contains(nums[i]))   set.add(nums[i]);
            else return true;
        }
        return false;
    }
}
