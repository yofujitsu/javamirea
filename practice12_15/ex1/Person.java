package practice12_15.ex1;

public class Person {
    String name;
    String surname;
    String otchestvo;

    public Person(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    private StringBuffer getInitial(String word) {
        if (word != "") {
            return new StringBuffer().append(word.charAt(0)).append(".");
        }

        return new StringBuffer("");
    }

    public String getFullName() {
        StringBuffer temp;
        StringBuffer resBuff = new StringBuffer(surname);

        temp = getInitial(name);
        if (temp.length() != 0) {
            resBuff.append(" ").append(temp);
        }

        temp = getInitial(otchestvo);
        if (temp.length() != 0) {
            if (resBuff.charAt(resBuff.length() - 1) == '.') {
                resBuff.append(temp);
            } else {
                resBuff.append(" ").append(temp);
            }
        }

        return resBuff.toString();
    }
}
