package com.FileWriterTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String[] text = {"Good morning", "Good afternoon", "Good Evening"};
		
		String path = "c:\\temp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : text) {
				bw.write(line);
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
