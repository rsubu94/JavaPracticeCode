package com.practice.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ReadFile {
	ReadFile() {
	}

	public static void main(String[] args) throws IOException {
		ClassLoader loader = ReadFile.class.getClassLoader();
		InputStream inputStream = loader.getSystemResourceAsStream("readfile.txt");
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			String lString;
			while ((lString = bufferedReader.readLine()) != null) {
				System.out.println(lString);
			}
		}

	}
}
