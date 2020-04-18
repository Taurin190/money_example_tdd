class Money {
    protected int amount;
    protected String currency;
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
    String currency() {
        return currency;
    }
    static public Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    static public Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String toString() {
        return amount + " " + currency;
    }
}
