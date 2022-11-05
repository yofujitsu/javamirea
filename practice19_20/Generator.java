package practice19_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Generator {
    public static final char[] symbols = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    private ArrayList<String> arrayList;
    private HashSet<String> hashSet;
    private TreeSet<String> treeSet;
    private int n;

    public Generator(int n) {
        this.n = n;
        arrayList = new ArrayList<>();
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();

        //generate(n);
        generateRandom(n);
    }

    private void fullArrays(char symbol1, char symbol2, char symbol3) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 200; j++) {
                String number = String.valueOf(symbol1) + i + i + i + String.valueOf(symbol2) + String.valueOf(symbol3);
                arrayList.add(number);
                hashSet.add(number);
                treeSet.add(number);
                n--;
            }
        }
    }

    private boolean straightSearch(String str) {
        return arrayList.contains(str);
    }

    private boolean binarySearch(String str) {
        return Collections.binarySearch(arrayList, str) >= 0;
    }

    private boolean hashSetSearch(String str) {
        return hashSet.contains(str);
    }

    private boolean treeSetSearch(String str) {
        return treeSet.contains(str);
    }

    public void straightSearchPrint(String str) {
        long m = System.nanoTime();
        String res;
        if (straightSearch(str))
            res = " FOUND ";
        else
            res = " NOT FOUND ";
        System.out.println("Straight Search number: " + str + res + "is " + (System.nanoTime() - m) + " ns");
    }

    public void binarySearchPrint(String str) {
        Collections.sort(arrayList);
        long m = System.nanoTime();
        String res;
        if (binarySearch(str))
            res = " FOUND ";
        else
            res = " NOT FOUND ";
        System.out.println("Binary Search number: " + str + res + "is " + (System.nanoTime() - m) + " ns");
    }

    public void hashSetPrint(String str) {
        long m = System.nanoTime();
        String res;
        if (hashSetSearch(str))
            res = " FOUND ";
        else
            res = " NOT FOUND ";
        System.out.println("HashSet Search number: " + str + res + "is " + (System.nanoTime() - m) + " ns");
    }

    public void treeSetPrint(String str) {
        long m = System.nanoTime();
        String res;
        if (treeSetSearch(str))
            res = " FOUND ";
        else
            res = " NOT FOUND ";
        System.out.println("TreeSet Search number: " + str + res + "is " + (System.nanoTime() - m) + " ns");
    }

    private void generateRandom(int n) {
        String number;
        while (n > 0) {
            number = "";
            number += symbols[(int) (Math.random() * symbols.length)];
            int num = (int) (Math.random() * 9);
            number += num;
            number += num;
            number += num;
            number += symbols[(int) (Math.random() * symbols.length)];
            number += symbols[(int) (Math.random() * symbols.length)];
            num = (int) (Math.random() * (199 - 1) + 1);
            if (num < 10)
                number += "0" + num;
            else
                number += num;
            if (hashSetSearch(number))
                generateRandom(n);
            else {
                n--;
                System.out.println(number);
                arrayList.add(number);
                hashSet.add(number);
                treeSet.add(number);
            }
        }
    }
}
