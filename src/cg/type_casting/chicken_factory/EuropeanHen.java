package cg.type_casting.chicken_factory;

class EuropeanHen extends Hen implements Continent{
private final int MONTHLY_EGG_COUNT = 19;
String continent = EUROPE;

@Override
String getDescription(){
	return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", this.continent, getMonthlyEggCount());
}

@Override
int getMonthlyEggCount() {
	return this.MONTHLY_EGG_COUNT;
}
}
