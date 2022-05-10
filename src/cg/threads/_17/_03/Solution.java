package cg.threads._17._03;


// region ORIGINAL
/*
import java.util.ArrayList;
import java.util.List;

public class Solution {

public static void main(String[] args) {

}

public static class Note {

	public final List<String> notes = new ArrayList<>();

	public void addNote(int index, String note) {
		System.out.println("A note [" + note + "] will now be added at position " + index);
		notes.add(index, note);
		System.out.println("The note [" + note + "] has already been added");
	}

	public void removeNote(int index) {
		System.out.println("A note will now be deleted from position " + index);
		String note = notes.remove(index);
		System.out.println("The note [" + note + "] has already been deleted from position " + index);
	}
}

}




//////////////////////
1. The Note class will be used by threads. So be sure that attempts to access the notes list lock notes, not this
2. Calls to System.out.println must not be synchronized, i.e. must not be in the synchronized block
Requirements:

    •
    The addNote() method should add notes to the notes list.
    •
    The removeNote() method must delete a note from the notes list.
    •
    The addNote() method must have a synchronized block.
    •
    The removeNote() method must have a synchronized block.
    •
    The synchronized block in the addNote() method must lock notes.
    •
    The synchronized block in the removeNote() method must lock notes.
    •
    The addNote() method's synchronized block must call the add method on notes.
    •
    The removeNote() method's synchronized block must call the remove method on notes.
    •
No screen output commands should be in the synchronized block.
 */
// endregion

import java.util.ArrayList;
import java.util.List;

public class Solution {

public static void main(String[] args) {
}

public static class Note {
   volatile String note;

	public final List<String> notes = new ArrayList<>();

	public void addNote(int index, String note) {
		System.out.println("A note [" + note + "] will now be added at position " + index);

		synchronized (notes) {
			notes.add(index, note);
		}

		System.out.println("The note [" + note + "] has already been added");
	}

	public void removeNote(int index) {
		System.out.println("A note will now be deleted from position " + index);

		{synchronized (notes) {
			String note = notes.remove(index);
		}}

		System.out.println("The note [" + note + "] has already been deleted from position " + index);
	}
}

}
