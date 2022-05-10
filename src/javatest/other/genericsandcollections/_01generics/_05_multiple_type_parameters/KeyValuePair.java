package javatest.other.genericsandcollections._01generics._05_multiple_type_parameters;

//13 multiple type parameters in a class
class KeyValuePair <K, V> {
	private K key;
	private V value;

	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
}
