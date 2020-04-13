package Solution500_600;

public class Solution504 {
    public String convertToBase7(int num) {
        if(num == 0)    return "0";
        StringBuilder sb = new StringBuilder();
        int num2 = num;
        num = Math.abs(num);
        while(num != 0){
            sb.append(num % 7);
            num /= 7;
        }
        if(num2 < 0) sb.append("-");
        return sb.reverse().toString();
    }
}
