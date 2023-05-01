package com.ThrowsException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {
	public void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:/abc.txt");
	}

	public void writeFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:/xyz.txt");
	}
}

public class HandlingThowsException {

	public static void main(String[] args) {

		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readFile();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("File not found");
		try {
			rw.writeFile();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("File is finding");
	}

}
