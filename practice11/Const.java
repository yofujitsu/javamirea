package practice11;

public class Const implements IOperation{
    private float n;

    public Const(float n) {
        this.n = n;
    }

    @Override
    public Value getValue() {
        return new Value(n, Value.ValueType.CONST);
    }
}
