package Solution400_500;

public class Solution492 {
    public int[] constructRectangle(int area) {
        if(area == 1 || area ==2) return new int[]{area,1};
        int i = 1;
        int j = area;
        int fi = i;
        int fj = j;
        int min = Integer.MAX_VALUE;
        for(i = 1; i < area/2; i++){
            boolean flag = false;
            if(area % i == 0){
                j = area / i;
                flag = true;
            }
            if(j - i < min && flag){
                fi = i;
                fj = j;
                min = i - j;
            }
        }
        return new int[]{fj,fi};
    }
}
