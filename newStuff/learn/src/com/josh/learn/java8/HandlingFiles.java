package com.josh.learn.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandlingFiles {

	public static void main(String[] args) {

		try {
			fileWriting();
			fileReading();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error Writing to a file " + e.getMessage());
		}

	}

	public static void fileWriting() throws IOException {

		String filename = "abc.txt";

		Files.write(Paths.get(filename),
				"munish , joshi , is writing, address, file operation \nmunish1 , joshi1 , is writing, address, file operation \nmunish , joshi , is writing, address, file operation"
						.getBytes());

	}

	public static void fileReading() throws IOException {

		String filename = "abc.txt";
		
		//List<String> lines = Files.lines(Paths.get(filename)).map(line -> Arrays.asList(line.split(",")));
		
		

		List<List<String>> list = Files.lines(Paths.get(filename))

				.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());

		for (List<String> str : list) {

			for (String st : str) {
				System.out.println(st);
			}

		}

	}

}
