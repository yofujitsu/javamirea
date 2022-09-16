package practice5;

public class recursion_14 {
    public static void write(int n){
        if(n==0) return;
        else {
            write(n/10);
            System.out.print(n%10 + " ");
        }
    }

    public static void main(String[] args) {
        write(990);
    }
}
