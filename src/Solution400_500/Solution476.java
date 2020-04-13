package Solution400_500;

public class Solution476 {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("---",4));
    }
    public static String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-","");
        int len = S.length();
        int firstLen = len % K;
        StringBuilder sb = new StringBuilder(S.substring(0,firstLen));
        for(int i = firstLen; i < len; i += K){
            sb.append("-" + S.substring(i,K + i));
        }
        if(sb.length() > 0 && sb.charAt(0) == '-')   return sb.substring(1,sb.length()).toUpperCase();
        return sb.toString().toUpperCase();
    }
}
