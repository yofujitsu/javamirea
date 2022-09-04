package practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tsvetkov","pochta@gmail.com",'M');

        System.out.println(author1.getEmail());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
        author1.setEmail("pochta2@gmail.com");
        System.out.println(author1.toString());
    }
}
