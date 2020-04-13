public class Soultion198 {

    public static void main(String[] args) {
        int nums[] = {1,6,74,10};
        System.out.println(rob(nums));
    }
        public static int rob(int[] num) {
            int preMax = 0;
            int currMax = 0;
            for(int x:num){
                int temp = currMax;
                currMax = Math.max(preMax+x, currMax);
                preMax = temp;
            }
            return currMax;
        }
}
