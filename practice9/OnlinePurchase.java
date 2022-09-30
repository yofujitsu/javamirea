package practice9;

import java.util.Scanner;
import static practice9.OnlinePurchase.shop;

public class OnlinePurchase {
    private OnlinePurchase(){};
    static OnlinePurchase shop = new OnlinePurchase();
    void confirmOrder(String fio, String INN) throws RuntimeException {
        if(INN.length() != 12) { throw new IllegalArgumentException(); }
    }
}

