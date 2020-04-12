public class Money {
    protected int amount;
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
