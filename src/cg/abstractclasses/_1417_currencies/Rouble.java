package cg.abstractclasses._1417_currencies;

public class Rouble extends Money{


public Rouble(double amount) {
	super(amount);
}

@Override
public String getCurrencyName() {
	return "RUB";
}
}
