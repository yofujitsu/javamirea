package practice1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Pushkin", "Lukomorye", 1820);
        Book book2 = new Book("Tolstoy","War and Peace");
        Book book3 = new Book("Lermontov");
        book2.setYear(1850);
        book3.setName("Borodino");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
