package Solution100_300;

public class Solution172 {
    public int trailingZeroes(int n) {
        int ref = 0;
        while(n>0){
            ref += n/5;
            n /= 5;
        }
        return ref;
    }
}
