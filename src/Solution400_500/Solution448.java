package Solution400_500;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            nums[index] = - Math.abs(nums[index]);
        }
        for(int i = 0; i < nums.length; i++)
            if(nums[i] > 0 )
                list.add(i);
        return list;
    }
}
