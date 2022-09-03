package practice;

import java.lang.*;

public class Ball {
    private int weight;
    private String name;

    public Ball(int n, String s) {
        name = s;
        weight = n;
    }
    public Ball(int n) {
        name = "";
        weight = n;
    }
    public Ball() {
        name = "";
        weight = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(Ball ball_xd) {
        System.out.println("Это имя -" + name);
        System.out.println("Это вес -" + this.weight);
    }
    Ball ball1 = new Ball(1, "Brazuca");
}