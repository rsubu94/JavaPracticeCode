package com.practice.arrays;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		// FileReader fr = null;
		// LineNumberReader lnr = null;
		String str;
		int i;

		try (FileReader fr = new FileReader("E:\\test.txt"); LineNumberReader lnr = new LineNumberReader(fr)) {
			// create new reader

			// read lines till the end of the stream
			while ((str = lnr.readLine()) != null) {
				i = lnr.getLineNumber();

				System.out.print("(" + i + ")");

				// prints string
				System.out.println(str);
			}

		}
	}
}
