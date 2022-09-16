package practice5;
import java.util.*;

public class recursion_11 {
    public static int recursion() {
        Scanner scan = new Scanner(System.in);
        int pprev = scan.nextInt();
        if (pprev == 1) {
            int prev = scan.nextInt();
            if (prev == 1) {
                return recursion() + pprev + prev;
            } else {
                int now = scan.nextInt();
                if (now == 1) {
                    return recursion() + pprev + prev + now;
                } else {
                    return pprev + prev + now;
                }
            }
        } else {
            int prev = scan.nextInt();
            if (prev == 1) {
                return recursion() + pprev + prev;
            } else {
                return pprev + prev;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion());
    }
}