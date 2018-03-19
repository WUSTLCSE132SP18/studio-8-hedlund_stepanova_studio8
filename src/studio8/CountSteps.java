package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps{
	
	


public static void main(String[] args) {
	File data = new File("C:\\Users\\shell\\git\\studio-8-hedlund_stepanova_studio8\\steps\\zdata.txt");
	double[] zdata;
	int count = 0;
	try {
		Scanner scnr = new Scanner(data);
		while(scnr.hasNextLine()) {
			String line = scnr.nextLine();
			zdata[count] = (double) line;
			count++;
			System.out.println(line);
			if ((zdata[i] > zdata[i-1]) && (zdata[i] > zdata[i+1])) {
				
			}
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}