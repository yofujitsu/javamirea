package practice5;

import java.util.Scanner;

public class recursion_13 {
    public static void odd_index(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x==0) return;
        if(x > 0) {
            System.out.println(x);
            x = scan.nextInt();
            odd_index();
        }
        else odd_index();
    }

    public static void main(String[] args) {
        odd_index();
    }
}
