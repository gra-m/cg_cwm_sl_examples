package cg.abstractclasses._1417_currencies;

public class USD extends Money{

public USD(double amount) {
	super(amount);
}

@Override
public String getCurrencyName() {
	return "USD";
}
}
