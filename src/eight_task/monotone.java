package eight_task;

import java.util.Scanner;

public class monotone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;
        for (int i = 0; i<=n+1; i++){
            System.out.println(k);
            if (i == k*(k + 1) / 2){
                k++;
            }
        }
    }
}
