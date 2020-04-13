public class Solution171 {
    public static void main(String[] args) {
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }
    public static int titleToNumber(String s) {
        String strs = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int j = 0, result = 0;
        for(int i=s.length()-1; i>=0; i--,j++){
            int num = strs.indexOf(s.charAt(i));
            result += num*Math.pow(26,j);
        }
        return result;
    }
}
