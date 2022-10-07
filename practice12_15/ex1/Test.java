package practice12_15.ex1;

public class Test {
    public static void main(String[] args) {
        Person x = new Person("Alexander", "Tsvetkov", "Sergeevich");
        Person y = new Person("", "lol", "bebrovich");
        System.out.println(x.getFullName());
        System.out.println(y.getFullName());
    }
}
