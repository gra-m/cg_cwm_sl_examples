package cg.abstractclasses._1417_currencies;

// region ORIGINAL CODE
/*package cg.abstractclasses._1417_currencies;

public abstract class Money {
public Money(double amount) {
}

public abstract double getAmount();

public abstract String getCurrencyName();
}*/

//endregion

public abstract class Money {
private double amount;

public Money(double amount) {
        this.amount = amount;
    }

public double getAmount() {
    return this.amount;
}

public abstract String getCurrencyName();
}

