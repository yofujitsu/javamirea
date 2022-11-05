package practice17_18;

import java.util.regex.*;

public class Test {
    public static boolean check(String x, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(x);

        return matcher.find();
    }

    public static void main(String[] args) {
        String test1 = "abcdefghijklmnopqrstuv18340";
        String test2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";
        System.out.println(check(test1, regex));
        System.out.println(check(test2, regex));

        test1 = "aE:dC:cA:56:76:54";
        test2 = "01:23:45:67:89:Az";
        regex = "^[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}$";

        System.out.println();
        System.out.println(check(test1, regex));
        System.out.println(check(test2, regex));

        test1 = "Test 23.78 USD 78 RUB";
        test2 = "Test 22 UDD, 0.002 USD ";
        regex = "\\d+\\.\\d{1,2} (USD)|(RUB)|(EU)";

        System.out.println();
        System.out.println(check(test1, regex));
        System.out.println(check(test2, regex));

        regex = "(\\.{2})*(\\*)?";
        String test = "fs*jdsfhgsfgsdj?";
        System.out.println();
        System.out.println(check(test, regex));
        //любые 2 первых - звездочка  - неогран любые - вопрос
    }
}
