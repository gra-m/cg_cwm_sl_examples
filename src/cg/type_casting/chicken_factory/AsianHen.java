package cg.type_casting.chicken_factory;

class AsianHen extends Hen implements Continent{
private final int MONTHLY_EGG_COUNT = 25;
String continent = ASIA;

@Override
String getDescription(){
	return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", this.continent, getMonthlyEggCount());
}

@Override
int getMonthlyEggCount() {
	return this.MONTHLY_EGG_COUNT;
}
}
