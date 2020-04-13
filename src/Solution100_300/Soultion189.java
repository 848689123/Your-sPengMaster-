public class Soultion189 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for (int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
    }

    public static void rotate(int[] nums, int k) {
        int cnt = 1;
        for(int i=0; cnt<=nums.length; i++){
            int j = i;
            int temp1 = nums[i];
            int temp2 = nums[(k+i)%nums.length];
            do {
                nums[(k+i)%nums.length] = temp1;
                i = (k+i)%nums.length;
                cnt++;
                temp1 = temp2;
                temp2 = nums[(k+i)%nums.length];
            }while (i!=j);
        }
    }

    public static void rotate2(int[] nums, int k) {
        int cnt = 1;
        int temp1 = nums[0];
        int temp2 = nums[k%nums.length];
        for(int i=0; cnt<=nums.length; cnt++){
            nums[(k+i)%nums.length] = temp1;
            i = (k+i)%nums.length;
            temp1 = temp2;
            temp2 = nums[(k+i)%nums.length];
        }
    }
}
