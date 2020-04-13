public class Main {
    public static void main(String[] args) {
        int list[] = new int[101];
        boolean flag[] = new boolean[101];
        for (int i = 0; i < 101; i++) {
            list[i] = i;
            flag[i] = true;
            System.out.println(1111);
        }
        for (int i = 2; i < 101; i++) {
            if (flag[i]) {
                for (int j = i + i; j < 101; j = j + i) {
                    flag[j] = false;
                }
            }
        }
        for (int i = 2; i < 101; i++) {
            if (flag[i]) {
                System.out.println(i);
            }
        }
    }
}
