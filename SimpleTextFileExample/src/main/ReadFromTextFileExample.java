package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFileExample {

	public static void main(String[] args) {
		
		File file = new File("data/person.txt");
		
		try {
			Scanner in = new Scanner(file);
			String fname;
			String lname;
			int age;
			
			fname = in.next();
			lname = in.next();
			age = in.nextInt();
			System.out.println(fname + " " + lname +" " + age );
		} catch (FileNotFoundException e) {
			System.out.println("Nu pot citi!!!");
		}
		
		

	}

}
