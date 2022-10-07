package practice16;

public class Test {
    public static void main(String[] args) {
        InternetOrder order = new InternetOrder();

        Dish pizza = new Dish(499, "Pizza", "Peperoni");

        order.add(new Dish("Fish", "yummy"));
        order.add(pizza);
        order.add(new Drink(179, "Salad", "Min'et"));
        System.out.println(order);

        order.remove(pizza);
        System.out.println(order);
    }
}
