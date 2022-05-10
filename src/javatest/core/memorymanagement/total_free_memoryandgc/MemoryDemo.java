package javatest.core.memorymanagement.total_free_memoryandgc;

public class MemoryDemo {
public static void main(String[] args) {

	Runtime runtime = Runtime.getRuntime();
	long memory1;
	long memory2;
	Integer[] someInts = new Integer[1000];

	System.out.println("Total memory is: " + runtime.totalMemory());

	memory1 = runtime.freeMemory();

	System.out.println("Initial free memory is: " + memory1);

	runtime.gc();
	memory1 = runtime.freeMemory();

	System.out.println("After garbage collection request free memory is: " + memory1);


	for (int i = 0; i<1000; i++)
		someInts[i] = Integer.valueOf(i);

	memory2 = runtime.freeMemory();

	System.out.println("After 1000 integer allocation free memory is: " + memory2);

	System.out.println("So memory used by the allocation = " + (memory1 - memory2));

	for (int i = 0; i<1000; i++)
		someInts[i] = null;

	runtime.gc();

	memory2 = runtime.freeMemory();

	System.out.println("After Integers nullified, and garbage collection requested free memory is: " + memory2);
}
}
