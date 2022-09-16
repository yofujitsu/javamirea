package practice5;

import java.util.Scanner;

public class recursion_12 {
    public static void odd() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x==0) return;
        else if (x % 2 > 0) {
            System.out.println(x);
            odd();
        }
        else odd();
    }

    public static void main(String[] args) {
        odd();
    }
}
