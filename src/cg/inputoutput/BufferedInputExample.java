package cg.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class BufferedInputExample {

	public static void main(String[] args) throws Exception {
		//InputStream inputStream = null;
		BufferedInputStream buffer = null;

		try {

			//inputStream = new FileInputStream("src/info.txt");

			//buffer = new BufferedInputStream(inputStream);

			//or

			buffer = new BufferedInputStream(new FileInputStream("src/info.txt"));

			while(buffer.available()>0) {

				char c = (char)buffer.read();

				System.out.println("Character read: " + c);
			}
		} catch(Exception e) {

			e.printStackTrace();

		} finally {

		//	inputStream.close();
			buffer.close();
		}
	}
}

