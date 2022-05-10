package cg.inputoutput;
//nop3
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

public static void main(String[] args) throws IOException {
	FileOutputStream outputStream = new FileOutputStream("src/bufferedout.txt");

	BufferedOutputStream bufferedStream = new BufferedOutputStream(outputStream);

	String text = "I love Java!"; // We'll convert this string to a byte array and write it to a file

	byte[] buffer = text.getBytes();

	bufferedStream.write(buffer, 0, buffer.length);
}
}