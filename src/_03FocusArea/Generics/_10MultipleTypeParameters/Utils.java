package _03FocusArea.Generics._10MultipleTypeParameters;

/**
 * Created by Gra_m on 2022 05 20
 */

public class Utils {

	public static <T extends Comparable<T>> T max(T first, T second) {
		// ;) replace with Math.max() call
		//return (first > second) ? first:second;
		// replace with compareTo
		return first.compareTo(second) < 0 ? second : first;
	}

	public static <K, V> void print(K key, V value){
		System.out.println(key + " = " + value);
	}
}
