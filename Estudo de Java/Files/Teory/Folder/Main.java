package com.Folder;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a path: ");
		
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("FILES: ");
		File[] files = path.listFiles(File::isFile);
		for(File file : files) {
			System.out.println(file);
		}
		
		System.out.println("Creating new Folder...");
		boolean test = new File("c:\\temp\\myFolder").mkdir();
		System.out.println("Deu certo? " + test);
		
		scan.close();
	}
}
