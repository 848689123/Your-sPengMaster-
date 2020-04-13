package Solution400_500;

public class Solution415 {
    public static void main(String[] args) {
        System.out.println(addStrings("","2"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        int len1 = sb1.length();
        int len2 = sb2.length();
        int min = len1<len2?len1:len2;
        int max = len1>len2?len1:len2;
        int result[] = new int[max+1];
        int flag = 0;
        for(int i=0;i<min;i++){
            int n1 = sb1.charAt(i)-'0';
            int n2 = sb2.charAt(i)-'0';
            int sum=n1+n2+flag;
            if(sum>9){
                result[i] = sum%10;
                flag = 1;
            }else{
                result[i] = sum;
                flag=0;
            }
        }
        int count = max;
        if(len1<len2){
            for(int i=min;i<max;i++){
                int n = sb2.charAt(i)-'0';
                int sum = n+flag;
                if(sum>9){
                    result[i] = sum%10;
                    flag = 1;
                }else {
                    result[i]=sum;
                    flag = 0;
                }
                count = i+1;
            }
        }
        if(len1>len2){
            for(int i=min;i<max;i++){
                int n = sb1.charAt(i)-'0';
                int sum = n+flag;
                if(sum>9){
                    result[i] = sum%10;
                    flag = 1;
                }else {
                    result[i]=sum;
                    flag = 0;
                }
                count = i+1;
            }
        }
        if(flag==1){
            result[count]=1;
            count++;
        }
        StringBuilder sb3 = new StringBuilder();
        if(flag!=1){
            if(count!=1)
                for(int i=count-1;i>-1;i--)
                    sb3.append(result[i]);
            else sb3.append(result[count-1]);
        }else{
            if(count!=1)
                for(int i=count-1;i>-1;i--)
                    sb3.append(result[i]);
            else sb3.append(result[count-1]);
        }
        return sb3.toString();
    }
}
