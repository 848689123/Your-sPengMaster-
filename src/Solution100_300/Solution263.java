public class Solution263 {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
    }
    public static boolean isUgly(int num) {
        while(num!=1&&num!=0){
            if(num%2==0){
                num /= 2;
            } else if(num%3==0){
                num /= 3;
            } else if(num%5==0){
                num /= 5;
            } else return false;
        }
        return true;
    }
}
