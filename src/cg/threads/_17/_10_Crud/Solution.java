package cg.threads._17._10_Crud;

// region ORIGINAL
/*
CrUD: Create, Update, Delete.

The program runs with one of the following sets of arguments:
xxxxxxxxxxxxxxx
-c name sex bd
-u id name sex bd
-d id
-i id
xxxxxxxxxxxxxxx

Argument values:
name (String)
sex ("m" or "f")
bd (birth date in the following format: "04 15 1990")
-c (adds a person with the specified arguments to the end of allPeople; displays the id on the screen)
-u (updates the data of the person with the specified id)
-d (performs the logical deletion of the person with the specified id; replaces all of its data with null)
-i (displays information about the person with the specified id: name sex (m/f) bd (format Apr 15 1990))

The id corresponds to the index in the list.
All the people should be stored in allPeople.
Use Locale.ENGLISH as the second argument for SimpleDateFormat


xxxxxxxxxxxxxxx
Example arguments:
-c Washington m "04 15 1990"

Example output for the -i argument:
Washington m Apr 15 1990
xxxxxxxxxxxxxxx

Requirements:
    •
    The Solution class must contain a public static List<Person> field called allPeople.
    •
    The Solution class must have a static block where two people are added to the allPeople list.
    •
    When you start the program with the -c argument, the program should add the person with the specified arguments to the end of the allPeople list and display the id (index).
    •
    When you run the program with the -u argument, the program must update the data of the person with the specified id in the allPeople list.
    •
    When you run the program with the -d argument, the program must perform the logical deletion the person with the specified id in the allPeople list.
    •
    When you run the program with the -i argument, the program should display the data about the person with the specified id in accordance with the format given in the task.
/////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solution {
public static List<Person> allPeople = new ArrayList<>();

static {
	allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
	allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
}

public static void main(String[] args) {
	// Start here
}
}
/////////////////////////////////////////
public enum Sex {
    MALE,
    FEMALE
}
/////////////////////////////////////////
public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}


 */
// endregion

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
private static String[] receivedArgs;
//-c
private static final int DATE_STRING = 3;
private static final int SEX_STRING = 2;
private static final int NAME_STRING = 1;
//-u
private static final int ID_STRING = 1;
public static List<Person> allPeople = new ArrayList<>();

static {
	allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
	allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
}

public static void main(String[] args) {


	String[] cmArgs = {"-c", "Create Male", "m", "04 15 1990"};
	String[] cfArgs = {"-c", "Create Female", "f", "07 15 1990"};


	String[] uArgs = {"-u", "0", "New Name", "f", "03 25 1991"};

	// replace each value with null
	String[] d0Args = {"-d", "0"};
	String[] d1Args = {"-d", "1"};

	// -i == info
	String[] i0Args = {"-i", "0"};
	String[] i1Args = {"-i", "1"};

	//Donald Chump m Apr 15 1990



	receivedArgs = d0Args;

	switch (receivedArgs[0]) {
		case "-c":
		{
			Date date = getDateFromString();

			if(isFemale()) {
				allPeople.add(Person.createFemale(args[1],  date));
				System.out.println("cf");
			} else {
				allPeople.add(Person.createMale(args[1],  date));
				System.out.println("cm");
			}
			break;
		}
		case "-u": {

			String name = receivedArgs[NAME_STRING + 1];
			Sex sex = isFemale() ? Sex.FEMALE : Sex.MALE;
			Date date = getDateFromString();
			int updateId = Integer.parseInt(receivedArgs[ID_STRING]);
			Person personToUpdate = allPeople.get(updateId);

			personToUpdate.setName(name);
			personToUpdate.setSex(sex);
			personToUpdate.setBirthDate(date);

			allPeople.set(updateId, personToUpdate);

			break;
		}
		case "-d": {

			System.out.println(allPeople + " BEFORE");

			int updateId = Integer.parseInt(receivedArgs[ID_STRING]);
			Person personToUpdate = allPeople.get(updateId);

			personToUpdate.setName(null);
			personToUpdate.setSex(null);
			personToUpdate.setBirthDate(null);

			allPeople.set(updateId, personToUpdate);

			System.out.println(allPeople + " AFTER");

			break;
		}
		case "-i": {

			int printId = Integer.parseInt(receivedArgs[ID_STRING]);
			System.out.println(allPeople.get(printId));

		}
	}


//	Person retrieved = allPeople.get(2);
//	System.out.println("TARGET = Create Female f Jul 15 1990::::  " + retrieved);
}

private static Date getDateFromString() {
	int adjustment = 0;
	if(receivedArgs[0].equals("-u"))
		adjustment++;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy", Locale.ENGLISH);
	LocalDateTime localDateTime = LocalDate.parse(receivedArgs[DATE_STRING + adjustment], dtf).atStartOfDay();
	return Date.from(localDateTime.atZone(ZoneId.of("Europe/Paris")).toInstant());
}


private static boolean isFemale() {
		return (receivedArgs[SEX_STRING].equals("f")) ? true : false;
	}

}
