package Solution400_500;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution455 {

    public static void main(String[] args) {
        int []g = {1,2,3};
        int s[] = {1,1};
        System.out.println(findContentChildren(g,s));
    }
    /**
     * g代表孩子胃口，s代表饼干
     * @param g
     * @param s
     * @return
     */

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int n1 = s.length;
        int n2 =  g.length;
        int i = 0;
        int j = 0;
        int count = 0;
        for(i = 0, j = n1 - 1; i <= j; i++, j--){
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        for(i = 0, j = n1 - 1; i <= j; i++, j--){
            int temp = g[i];
            g[i] = g[j];
            g[j] = temp;
        }
        for(i = 0, j = 0; i < n1 && j < n2; i++, j++){      //n1代表饼干，n2代表小孩
            if(s[i] >= g[j])
                count++;
            else i--;
        }
        return count;
    }
}
