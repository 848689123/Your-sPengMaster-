package Solution400_500;

public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xStr[] = new int[33];
        int yStr[] = new int[33];
        for(int i=0;i<33;i++){
            xStr[i]=0;
            yStr[i]=0;
        }
        int i=0;
        while(x!=0){
            xStr[i] = x%2;
            x/=2;
            i++;
        }
        i =0;
        while(y!=0){
            yStr[i] = y%2;
            y/=2;
            i++;
        }
        int count=0;
        for(i=0;i<33;i++){
            if((xStr[i]^yStr[i])!=0)
                count++;
        }
        return count;
    }
}
