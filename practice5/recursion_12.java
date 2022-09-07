package practice5;

import java.util.Scanner;

public class recursion_12 {
    public static void odd() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = scan.nextInt();
        String str_x = "" + x;
        new StringBuilder(str_x).reverse().toString();
        for(int i = str_x.length() - 1; i >= 0; --i) {
            int curr = (int)str_x.charAt(i);
            if(curr % 2 > 0) {
                System.out.println(curr);
            }
        }
    }

    public static void main(String[] args) {
        odd();
    }
}
