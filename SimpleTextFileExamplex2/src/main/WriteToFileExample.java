package main;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteToFileExample {

	public static void main(String[] args) {
		
		      
		
		 try {
			 File file = new File ("data/person.txt");
			 FileWriter myWriter = new FileWriter (file);
		
			 Scanner in = new Scanner(System.in);
		      String fname;
		      String lname;
		      int age; 
	          fname = in.next();
	          lname = in.next();
	          age = in.nextInt();
	         
	          
		      myWriter.write(fname+ " " + lname + " " + age);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (Exception e) {
		      System.out.println("An error occurred.");
		    }
	}

}
