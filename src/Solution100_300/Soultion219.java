import java.util.HashMap;
import java.util.Map;

public class Soultion219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        if(length<=1) return false;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0; i<length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],i);
            else{
                int index = map.get(nums[i]);
                if(i-index<k)
                    return true;
            }
        }
        return false;
    }
}
