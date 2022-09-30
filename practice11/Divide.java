package practice11;

public class Divide extends BinaryOperation implements IOperation {
    public Divide(IOperation first, IOperation second) {
        super(first, second);
        value.operation = "/";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
