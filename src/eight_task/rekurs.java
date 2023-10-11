package eight_task;

import java.util.Scanner;

public class rekurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rekurs rekurs = new rekurs();
        rekurs.fun(n);
    }

    public void fun(int n) {
        if (n!=1){
            fun(n-1);

        }
        System.out.println(n);
    }
}

