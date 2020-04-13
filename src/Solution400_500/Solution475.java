package Solution400_500;

import java.util.Arrays;

/**
 * 做不出来
 */
public class Solution475 {
    public static void main(String[] args) {
        System.out.println(findRadius(new int[]{1,2,3},new int[]{2}));
    }
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int r = 0;
        for(int c : houses){
            int left = 0;
            int right = heaters.length - 1;
            while(left < right){
                int mid = (left + right) >> 1;
                if(heaters[mid] < c)
                    left = mid + 1;
                else right = mid;
            }
            if(heaters[left] == c)
                continue;
            else if(heaters[left] < c)
                r = r > c - heaters[left] ? r : c - heaters[left];
            else if(left != 0)
                r = r > Math.min(heaters[left] - c, c - heaters[left - 1]) ?
                        r : Math.min(heaters[left] - c, c - heaters[left - 1]);
            else
                r = r > heaters[left] - c ? r : heaters[left] - c;
        }
        return r;
    }
}
