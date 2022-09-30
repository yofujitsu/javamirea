package practice9;

import java.util.Scanner;

import static practice9.OnlinePurchase.shop;

public class User {
    String fio;
    String INN;
    void order() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите своё ФИО: ");
        fio = sc.nextLine();
        System.out.print("Вевдите свой ИНН (12 цифр): ");
        INN = sc.nextLine();
        try {
            shop.confirmOrder(fio, INN);
        } catch (RuntimeException e) {
            throw new OnlinePurchaseException("Неверный ИНН", e);
        }
        System.out.println("Заказ был успешно выполнен!");
    }
}
