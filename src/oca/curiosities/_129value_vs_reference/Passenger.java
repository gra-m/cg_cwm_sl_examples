package oca.curiosities._129value_vs_reference;

public class Passenger {
private String name;
private String passportNo;

public Passenger(final String name, final String passportNo) {
	this.name = name;
	this.passportNo = passportNo;
}

public static void main(String[] args) {

	String flight = "LM345";
	Passenger passenger = new Passenger("Full Name", "122222312Ldf");
	checkIn(flight, passenger);
	System.out.println("values now:::::::::::");
	System.out.println(flight);
	System.out.println(passenger.name);

}

static void checkIn(String flightNum, Passenger passenger) {
	flightNum = "LM999";
	passenger.name = "Mr " + passenger.name;

	if(passenger.passportNo.equals("122222312Ldf"))
		System.out.println("Checked In");
	else
		System.out.println("Wrong Passport");

}


}
