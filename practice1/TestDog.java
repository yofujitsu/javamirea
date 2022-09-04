package practice1;

public class TestDog {
    public static void main(String[] args) {
        Dog ben = new Dog("Ben", 10);
        Dog elton = new Dog("Elton");
        Dog tyson = new Dog();
        elton.setAge(2);
        tyson.setAge(5);
        System.out.println(ben.toString());
        System.out.println(elton.toString());
        System.out.println(tyson.toString());
    }
}
