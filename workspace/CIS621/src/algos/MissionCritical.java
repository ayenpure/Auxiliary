package algos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Machine {
	double cost;
	double reliability;
}

public class MissionCritical {

	public static void main(String[] args) {
		double budget;
		double numberOfMachines;
		FileReader reader = null;
		try {
			reader = new FileReader("input.txt");
		} catch (FileNotFoundException e) {
			System.err.println("Error occurred in reading the input file, " + e.getMessage());
			System.exit(0);
		}
		BufferedReader buffReader = new BufferedReader(reader);
		String line = null;
		try {
			while((line=buffReader.readLine())==null) {
				
			}
			buffReader.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
