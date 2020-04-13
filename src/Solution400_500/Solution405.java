package Solution400_500;

/**
 * 抄的
 */
public class Solution405 {
    public String toHex(int num) {
        long []a =  new long[8];
        char []temp = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        long number = num;
        long yushu = 0;
        int i =0;
        if(number < 0){
            number += 4294967296L;
        }
        while(true){
            if(number ==0){
                return "0";
            }else if(number >0 && number <16){
                a[i] = number;
                break;
            }else{
                yushu = number %16;
                number = number /16;
                a[i] = yushu;
            }
            i++;
        }
        StringBuffer sb = new StringBuffer();
        for(int j =i;j>=0;j--){
            int c= (int)a[j];
            sb.append(temp[c]);
        }
        return sb.toString();
    }
}
