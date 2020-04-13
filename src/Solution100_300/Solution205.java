package Solution100_300;

public class Solution205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        boolean flag = isIsomorphic2(s,t);
        if(flag)
            flag = isIsomorphic2(t,s);
        return flag;
    }

    private static boolean isIsomorphic2(String s, String t) {
        int count = 0;
        char[] str1 = new char[1000];
        char[] str2 = new char[1000];
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            int index = 0;
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            boolean sig = true;
            for(int j=0; j<count; j++){
                if(ch1==str1[j]){
                    index = j;
                    sig = false;
                    break;
                }
            }
            if(sig){
                str1[count] = ch1;
                str2[count] = ch2;
                count++;
            }else{
                if(str2[index]!=t.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!check(str2,ch2,count-1)&&sig){
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static boolean check(char[] str2, char ch2, int count) {
        if(count<1) return true;
        for(int i=0; i<count; i++){
            if(ch2!=str2[i])
                return true;
        }
        return false;
    }
}
