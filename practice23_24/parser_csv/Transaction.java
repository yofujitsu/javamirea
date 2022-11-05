package practice23_24.parser_csv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transaction {
    private String id;
    private String date;
    private String startBalance;
    private String profit;
    private String expenditure;
    private String percents;
    private String cashback;
    private String endBalance;

    private double castToDouble(String string){
        Pattern pattern = Pattern.compile("^(\\d+).(\\d+)");
        Matcher matcher = pattern.matcher(string);
        matcher.find();
        return Double.parseDouble(matcher.group(0));
    }

    public String getDate() {
        return date;
    }

    public String getProfit() {
        return profit;
    }

    public String getExpenditure() {
        return expenditure;
    }

    public String getPercents() {
        return percents;
    }

    public String getCashback() {
        return cashback;
    }

    @Override
    public String toString() {
        return "Transaction = {\n\tid=" +
                id +
                ",\n\tdate=" +
                date +
                ",\n\tstartBalance=" +
                startBalance +
                ",\n\tprofit=" +
                profit +
                ",\n\texpenditure=" +
                expenditure +
                ",\n\tpercents=" +
                percents +
                ",\n\tcashback=" +
                cashback +
                ",\n\tendBalance=" +
                endBalance +
                "\n}";
    }
}
