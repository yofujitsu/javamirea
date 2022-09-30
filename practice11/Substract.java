package practice11;

public class Substract extends BinaryOperation implements IOperation {
    public Substract(IOperation first, IOperation second) {
        super(first, second);
        value.operation = "-";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
