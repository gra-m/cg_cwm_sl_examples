package oca.curiosities.enthu;

public class StringIntoLong {
String mStr = "123";

public static void main(String[] args) {
	StringIntoLong stringIntoLong = new StringIntoLong();

	Long long1 = new Long(stringIntoLong.mStr);

	Long long2 = Long.valueOf(stringIntoLong.mStr).longValue(); // the chained call at end is unboxing.

	Long long3 = Long.parseLong(stringIntoLong.mStr);

}
}
