package javatest.core.javadeclarations.static_vs_instance;

import java.util.ArrayList;

class _03CounterConstant {
	private static int count;
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();

	public _03CounterConstant() { count++; }
	public static void main(String[] args) {
		_03CounterConstant c1 = new _03CounterConstant();
		_03CounterConstant c2 = new _03CounterConstant();
		_03CounterConstant c3 = new _03CounterConstant();
		System.out.println(count); // 3

		//NUM_BUCKETS = 4; // It's a constant dummy..
		values.add("can change, values is a refernce variable");
		ArrayList<String> woggle = new ArrayList<>();
		//values = woggle; // but cannot assign it another value
	}
}