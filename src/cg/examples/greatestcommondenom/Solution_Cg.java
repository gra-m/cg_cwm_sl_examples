package cg.examples.greatestcommondenom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Solution_Cg {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	int first = parseInt(reader.readLine());
	int second = parseInt(reader.readLine());

	System.out.println(getNOD(first, second));

}

private static int getNOD(int first, int second) {
	if (first < 1 || second < 1) {
		throw new IllegalArgumentException();
	}

	while(first != second) {
		if (first > second) {
			first -= second;
		}
		if (second > first) {
			second -= first;
		}
	}
	return first;

}

}
