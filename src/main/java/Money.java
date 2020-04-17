abstract class Money {
    protected int amount;
    protected String currency;
    abstract Money times(int multiplier);
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return amount == dollar.amount && getClass().equals(object.getClass());
    }
    String currency() {
        return currency;
    }
    static public Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static public Money franc(int amount) {
        return new Franc(amount, "CHF");
    }
}
