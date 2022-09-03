package practice1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Pushkin", "Lukomorye", 1820);
        Book book2 = new Book("Tolstoy","War and Peace",1800);
        book2.setName("Anna Karenina");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
