package Solution500_600;

public class Solution551 {
    public boolean checkRecord(String s) {
        int count1 = 0; //缺勤计数器；
        int count2 = 0;//迟到计数器
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                count1++;
                count2 = 0;
                if (count1 > 1)
                    return false;
            } else if (c == 'L') {
                count2++;
                if (count2 > 2)
                    return false;
            } else if (c == 'P')
                count2 = 0;
        }
        return true;

    }

}
