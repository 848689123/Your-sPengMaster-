public class Solution278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle = 0;
        while(left<=right){
            middle = left+(right-left)/2;
            if(isBadVersion(middle)&&isBadVersion(middle-1)){
                left = middle+1;
            }else if(!isBadVersion(middle)){
                right = middle-1;
            }else {
                break;
            }
        }
        return middle;
    }

    private boolean isBadVersion(int index) {
        return true;
    }
}
