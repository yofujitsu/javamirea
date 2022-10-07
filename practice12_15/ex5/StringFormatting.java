package practice12_15.ex5;

public class StringFormatting {
    public enum FormattingType {
        ERROR,
        SUCCESS,
    }

    public FormattingType type;
    public StringBuilder res;

    public StringFormatting(FormattingType type, StringBuilder res) {
        this.type = type;
        this.res = res;
    }

    public StringFormatting() {}
}
