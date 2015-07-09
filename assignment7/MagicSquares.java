package assignment7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * MIT6_092 Assignment 7
 * Magical squares
 * @author yutian
 * @since Jul 8, 2015
 */
public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
    	
    	boolean isMagic = true;
    	try
    	{
    		// Open the file
            BufferedReader reader = new BufferedReader(new FileReader(pathName));

            
            int lastSum = -1;
            
            // For each line in the file ...
            String line;
            while ((line = reader.readLine()) != null) {
                // ... sum each row of numbers
            	if (line.isEmpty())
            		continue;
            	
                String[] parts = line.split("\t");
                int sum = 0;
                for (String part : parts) {
//					System.out.println(part);
                	sum += Integer.valueOf(part);
                }

                if (lastSum == -1) {
                    // If this is the first row, remember the sum
                    lastSum = sum;
                } else if (lastSum != sum) {
                    // if the sums don't match, it isn't magic, so stop reading
                    isMagic = false;
                    break;
                }
            }
            
            reader.close();
    	}
    	catch (IOException e)
    	{
    		System.err.println("Error!");
    	}
    	return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}
