public class Solution258 {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        int []list = new int[10];
        while(true){
            int count = 0;
            while(num!=0){
                list[count] = num%10;
                num /= 10;
                count++;
            }
            for(int i=0; i<count; i++)
                num += list[i];
            if(num<10)  return num;
        }
    }
}
