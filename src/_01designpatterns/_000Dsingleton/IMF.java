package _01designpatterns._000Dsingleton;

import static java.util.Objects.isNull;
public class IMF {

private static IMF imf;

public static IMF getFund() {
	{synchronized (IMF.class) {
		if (isNull(imf))
			return imf = new IMF();
		else
			return imf;
	}}
}

private IMF() {
}
}