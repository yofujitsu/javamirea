package practice19_20;

import java.util.Scanner;

public class CarNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n - кол-во генерируемых номеров: ");
        int n = sc.nextInt();
        Generator generate = new Generator(n);
        int w = 1;
        while (w == 1) {
            String var;
            System.out.print("Введите номер для поиска: ");
            var = sc.next();
            generate.straightSearchPrint(var);
            generate.hashSetPrint(var);
            generate.treeSetPrint(var);
            generate.binarySearchPrint(var);
            System.out.print("Хотите продолжить? (1/0): ");
            w = sc.nextInt();
        }
    }
}
