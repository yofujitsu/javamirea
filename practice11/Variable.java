package practice11;

public class Variable implements IOperation {
    private String var;

    public Variable(String var) {
        this.var = var;
    }

    @Override
    public Value getValue() {
        return new Value(var, Value.ValueType.VAR);
    }
}
