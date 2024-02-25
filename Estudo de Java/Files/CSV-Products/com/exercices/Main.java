package com.exercices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.exercices.entities.Product;

public class Main {
	// Read a csv file with the products data and add to other csv file
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strPath = scan.next();
		
		ArrayList<Product> products = null;
		
		File baseFile = new File(strPath);
		newFolder(baseFile);
		
		String folderPath = baseFile.getParent() + "\\out.summary.csv";
		
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(folderPath))){
			products = getProducts(new FileReader(strPath));
			
			for (Product product : products) {
				
				writer.write(product.toString());
				writer.newLine();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		scan.close();
	}
	
	public static ArrayList<Product> getProducts(FileReader baseFile) throws IOException {
		ArrayList<Product> products = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(baseFile);
		String line = reader.readLine();
		
		while (line != null) {
			String[] items = line.split(",");
			products.add(new Product(items[0], Double.parseDouble(items[1]), Integer.parseInt(items[2])));
			line = reader.readLine();
		}

		return products;
	}

	public static void newFolder(File baseFile) {
		String dirPath = baseFile.getParent() + "\\out\\";

		File file = new File(dirPath);
		file.mkdir();
	}
//c:\\c:\\temp\\source.csv
}
