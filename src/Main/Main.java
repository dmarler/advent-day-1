package Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Load a file with our input.
		File f = new File("Your input file");
		BufferedReader br = new BufferedReader(new FileReader(f));
		 
		// Create our input and frequency values.
		String input;
		int freq = 0;
		
		// Read each line of the input. If the line is not empty, then add the value to the frequency.
		// Note: I used a string for the input because an int can't be null.
		while ((input = br.readLine()) != null) {
			freq += Integer.parseInt(input);
		}
		
		// Print the end frequency.
		System.out.println(freq);
	}

}
