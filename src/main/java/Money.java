public class Money {
    protected int amount;
    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return amount == dollar.amount && getClass().equals(object.getClass());
    }
    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
}
