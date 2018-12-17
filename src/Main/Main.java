package Main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Load a file with our input.
		File f = new File("Path to your file here.");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		String input;
		
		// Read the text file and put the contents into an ArrayList.
		while ((input = br.readLine()) != null) {
			inputList.add(Integer.parseInt(input));
		}
		
		System.out.println("Frequency after one round of changes: " + partOne(inputList));
		System.out.println("First repeated frequency: " + partTwo(inputList));
		
		br.close();
	}
	
	// Sum the list of frequency changes and return the final result.
	public static int partOne(ArrayList<Integer> input) {
		
		int freq = 0;
		
		for (Integer i : input) {
			freq += i;
		}
		
		return freq;
	}

	public static int partTwo(ArrayList<Integer> input) {

		// Log to keep track of past frequencies.
		ArrayList<Integer> freqLog = new ArrayList<Integer>();

		// Current frequency to compare to list.
		int currentFreq = 0;

		// Counter to loop through frequency changes.
		int counter = 0;
		
		do {
			// Add the old frequency to the log and set the new current frequency.
			freqLog.add(currentFreq);
			currentFreq += input.get(counter % input.size());
			counter++;

			// Check that the current frequency hasn't been repeated.
		} while (!freqLog.contains(currentFreq));
		
		return currentFreq;
	}
}
