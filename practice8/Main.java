package practice8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> db = new ArrayList<Person>();
        Person test = new Person("Alex", 19);
        db.add(test);
        db.add(new Person("Tahu", 14));
        db.add(new Person("Sqwore", 18));
        db.add(new Person("Rizza", 21));

        WaitList<Person> waitlist = new WaitList<Person>(db);
        System.out.println(waitlist);
        waitlist.add(new Person("fuji!", 28));
        System.out.println(waitlist.contains(test));
        System.out.println(waitlist);
    }
}
