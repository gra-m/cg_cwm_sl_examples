package cg.abstractclasses._1417_currencies;

public class Euro extends Money{

public Euro(double amount) {
	super(amount);
}

@Override
public String getCurrencyName() {
	return "EUR";
}
}
