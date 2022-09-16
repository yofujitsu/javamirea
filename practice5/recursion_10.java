package practice5;

public class recursion_10 {
    public static int int_reverse(int n, int i) {
        return n == 0 ? i : int_reverse(n / 10, i * 10 + n % 10);
    }
    public static void main(String[] args) {
        System.out.println(int_reverse(123456, 0));
    }
}
