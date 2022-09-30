package practice11;

public class Multiply extends BinaryOperation implements IOperation{
    public Multiply(IOperation first, IOperation second) {
        super(first, second);
        value.operation = "*";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
