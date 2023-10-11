package eight_task;

import java.util.Scanner;

class Main {
    public static void count(int a, int b) {
        if (a < b) {
            count(a, b - 1);
            System.out.println(b);
        } else if (a > b) {
            System.out.println(a);
            count(a - 1, b);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        count(a, b);
    }
}