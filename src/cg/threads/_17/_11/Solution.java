package cg.threads._17._11;

// region ORIGINAL
/*

Synchronized notes: part 2

The Note class will be used by threads. So be sure to synchronize all methods.

Requirements:

    •
    The addNote() method should add notes to the notes list.
    •
    The removeNote() method must delete a note from the notes list.
    •
    The addNote() method must be synchronized.
    •
    The removeNote() method must be synchronized.

/////////////////////////////////
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
 */
// endregion

import java.util.ArrayList;
import java.util.List;

public class Solution {

public static void main(String[] args) {

}

public static class Note {

	public final List<String> notes = new ArrayList<>();

	public synchronized void addNote(int index, String note) {
		System.out.println("A note [" + note + "] will now be added at position " + index);
		notes.add(index, note);
		System.out.println("The note [" + note + "] has already been added");
	}

	public synchronized void removeNote(int index) {
		System.out.println("A note will now be deleted from position " + index);
		String note = notes.remove(index);
		System.out.println("The note [" + note + "] has already been deleted from position " + index);
	}
}
}
