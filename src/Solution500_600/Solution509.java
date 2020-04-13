package Solution500_600;

public class Solution509 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int N) {
        int f[] = new int[2];
        f[0] = 0;
        f[1] = 1;
        int result = 0;
        for(int i=2;i<=N;i++){
            result = f[0]+f[1];
            f[0] = f[1];
            f[1] = result;
        }
        return result;
    }
}
