package javatest.core.javadeclarations.static_initialization;

class _01Static {
private static final int NUM_SECONDS_PER_HOUR;

static {
	int numSecondsPerMinute = 60;
	int numMinutesPerHour = 60;
	NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
}

public static void main(String[] args) {
	_01Static staticInitializer = new _01Static();
	System.out.println(_01Static.NUM_SECONDS_PER_HOUR);
	System.out.println(NUM_SECONDS_PER_HOUR);
}
}
