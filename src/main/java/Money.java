abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return amount == dollar.amount && getClass().equals(object.getClass());
    }
    static public Money dollar(int amount) {
        return new Dollar(amount);
    }
    static public Money franc(int amount) {
        return new Franc(amount);
    }
}
