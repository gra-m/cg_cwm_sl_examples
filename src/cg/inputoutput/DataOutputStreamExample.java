package cg.inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamExample {
	public static void main(String[] args) throws IOException {
		DataOutputStream dataOutputStream =
			new DataOutputStream(new FileOutputStream("src/testFile.txt"));

		dataOutputStream.writeUTF("SomeString");
		dataOutputStream.writeInt(22);
		dataOutputStream.writeDouble(1.21323);
		dataOutputStream.writeBoolean(true);
	}
}
