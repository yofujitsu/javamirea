package practice11;

public class Add extends BinaryOperation implements IOperation {
    public Add(IOperation first, IOperation second) {
        super(first, second);
        value.operation = "+";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
