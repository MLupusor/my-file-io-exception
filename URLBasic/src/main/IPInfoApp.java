package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class IPInfoApp {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a domain or ip: ");
//		String name = in.next();

		
        File file =  new File("domains/domains.txt");

		try {
			File file2 = new File("domainsx2/domains-info.txt");
            FileWriter writer = new FileWriter(file2);
			
			Scanner in = new Scanner(file);
			String name;
		
			URL url;
			while(in.hasNext()) {
			name = in.next();
			url = new URL("http://ip-api.com/line/"+name);
			Scanner uin = new Scanner(url.openStream());
		
			int ln = 0;
			while(uin.hasNext()) {
				String line = uin.nextLine();
				if(ln == 0 && line.equals("fail")){
					break;
				} 
				if(ln == 2 || ln == 9 ) {
//					System.out.print(line);
					writer.write(line + " ");
				}
				else if(ln == 12) {
					writer.write(line + "\n");
				}
				ln++;
			}
		}
		writer.close();
		System.out.println("Successfully wrote to the file.");
		
		} catch (MalformedURLException e) {
			System.err.println("WRONG URL");
			
		} catch (IOException e) {
			System.err.println("CANNOT ACCESS DATA");
		}
	}
}
