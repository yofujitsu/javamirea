package practice1;
//lombok
public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
        year = 1970;
    }

    public Book(String author) {
        this.author = author;
        name = "no name";
        year = 1970;
    }

    public Book() {
        author = "no author";
        name = "no name";
        year = 1970;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
