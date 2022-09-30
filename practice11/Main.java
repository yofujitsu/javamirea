package practice11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        float x = (float) sc.nextDouble();
        //x^2 - 2x + 1
        System.out.println(
                new Add(
                        new Substract(
                                new Multiply(new Variable("x"), new Variable("x")),
                                new Multiply(new Const(2), new Variable("x"))
                        ),
                        new Const(1)
                )
                        .evaluate(x)
        );
    }
}

