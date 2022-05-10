package cg.type_casting.chicken_factory;

class NorthAmericanHen extends Hen implements Continent{
private final int MONTHLY_EGG_COUNT = 20;
String continent = NORTHAMERICA;

@Override
String getDescription(){
	return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", this.continent, getMonthlyEggCount());
}

@Override
int getMonthlyEggCount() {
	return this.MONTHLY_EGG_COUNT;
}
}
