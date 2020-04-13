public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        int sum = 0;
        while(n!=0){
            sum++;
            n &= n-1;
        }
        if(sum!=1)
            return false;
        return true;
    }
}
