package eight_task;

import java.util.Scanner;

public class sum_number {
    public static int brute(int len, int sum, int k, int s) {
        if (len == k) {
            return sum == s ? 1 : 0;
        }

        int c = (len == 0) ? 1 : 0;
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += brute(len + 1, sum + i, k, s);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(brute(0, 0, k, s));
    }
}