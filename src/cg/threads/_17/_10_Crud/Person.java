package cg.threads._17._10_Crud;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

public String getStringSex() {
		return sex == Sex.FEMALE ? "f" : "m";
}

public void setSex(Sex sex) {
	this.sex = sex;
}

public Date getBirthDate() {
	return birthDate;
}

public String getStringBirthDate() {
	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
	return sdf.format(birthDate);
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}


@Override
public String toString() {
	return name + " " + getStringSex() + " " + getStringBirthDate();
}

}
