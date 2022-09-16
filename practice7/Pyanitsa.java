package practice7;

import java.util.*;

public class Pyanitsa {

    public static <T> void insert_at_bottom(Stack<T> stack, T x) { //вставить карту вниз
        if (stack.isEmpty()) stack.push(x);
        else {
            T a = stack.peek(); //начальный элемент стека
            stack.pop();
            insert_at_bottom(stack, x);
            stack.push(a);
        }
    }

    public static <T> Stack<T> reverse(Stack<T> stack) { //реверс стека
        if (stack.size() > 0) {
            T x = stack.peek();
            stack.pop();
            reverse(stack);
            insert_at_bottom(stack, x);
        }
        return stack;
    }
    public static void GameStack() {
        Scanner scan = new Scanner(System.in);

        int x1[] = new int[5];
        int x2[] = new int[5];

        for(int i = 0; i < 5; ++i)
        {
            x1[i] = scan.nextInt();
        }

        for(int i = 0; i < 5; ++i)
        {
            x2[i] = scan.nextInt();
        }
        //стэки для активных колод и для 2 карт хода
        Stack<Integer> deck1 = new Stack<Integer>();
        Stack<Integer> deck2 = new Stack<Integer>();
        Stack<Integer> tempDeck1 = new Stack<Integer>();
        Stack<Integer> tempDeck2 = new Stack<Integer>();

        //пушим колоды в стеки
        for (int i = 4; i >= 0; --i) {
            deck1.push(x1[i]);
        }
        for (int i = 4; i >= 0; --i) {
            deck2.push(x2[i]);
        }

        int card1, card2;
        for (int i = 1; i <= 106; ++i) {
            card1 = deck1.pop();
            card2 = deck2.pop();

            //если первый бьет второго (+шестерка туз) - кидаем карты в биту
            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && !(card1 == 9 && card2 == 0)) {
                tempDeck1.push(card2);
                tempDeck1.push(card1);
                Stack<Integer> temptemp1 = reverse((Stack<Integer>) deck1.clone());
                while(temptemp1.size() > 0) {
                    int top_card = temptemp1.pop();
                    tempDeck1.push(top_card);
                }
                deck1 =(Stack<Integer>) tempDeck1.clone();
                tempDeck1.clear();
            }
            //если второй бьет первого
            else {
                tempDeck2.push(card2);
                tempDeck2.push(card1);
                Stack<Integer> temptemp2 = reverse((Stack<Integer>) deck2.clone());
                while(temptemp2.size() > 0) {
                    int top_card = temptemp2.pop();
                    tempDeck2.push(top_card);
                }
                deck2 = (Stack<Integer>) tempDeck2.clone();
                tempDeck2.clear();
            }


            //выводим ситуацию на столе
            System.out.println(deck1 + " | " + deck2);

            //проигрыш первого
            if (deck1.size() == 0) {
                System.out.println("second" + " " + i);
                return;
            }

            if (deck2.size() == 0) { //аналогичная ситуация со вторым
                System.out.println("first" + " " + i);
                return;
            }
        }

        System.out.println("botva :)"); //бесконечная игра
    }

    public static void GameDequeue() {
        Scanner scan = new Scanner(System.in);

        Deque<Integer> deck1 = new ArrayDeque<Integer>();
        Deque<Integer> deck2 = new ArrayDeque<Integer>();

        for (int i = 0; i < 5; ++i) {
            deck1.addLast(scan.nextInt());
        }

        for (int i = 0; i < 5; ++i) {
            deck2.addLast(scan.nextInt());
        }

        int card1, card2;
        for (int i = 1; i <= 106; ++i) {
            card1 = deck1.pop();
            card2 = deck2.pop();
            if ((card1 > card2 || (card1 == 0 && card2 == 9)) && !(card1 == 9 && card2 == 0))
            {
                deck1.addLast(card1);
                deck1.addLast(card2);
            }
            else
            {
                deck2.addLast(card1);
                deck2.addLast(card2);
            }

            System.out.println(deck1 + " | " + deck2);

            if (deck1.size() == 0)
            {
                System.out.println("second" + " " + i);
                return;
            }

            if (deck2.size() == 0)
            {
                System.out.println("first" + " " + i);
                return;
            }
        }

        System.out.println("botva :)");
    }

    public static void main(String[] args) {
        System.out.println("Stack: ");
        GameStack();
        System.out.println("Deque: ");
        GameDequeue();
    }
}
