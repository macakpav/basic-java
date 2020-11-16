/**
 * 
 */
package exerciseFive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a program that counts the number of lines in each file, with the list
 * of files being specified as command line arguments to your program, for
 * example, if you were to run your program from the command line as follows:
 * "java LineCounter file1.txt file2.txt file3.txt". You can assume that the
 * files are text files. Write each file name, along with the number of lines in
 * that file, to standard output. If an error occurs while trying to read from
 * one of the files, you should print an error message for that file, but you
 * should still process all the remaining files. Does not count empty lines.
 * 
 * @author Pavel Mačák
 *
 */
public class LineCounter {

    public static void main(String[] args) {

	for (String fileName : args) {
	    try (BufferedReader read = new BufferedReader(
		    new FileReader("src/exerciseFive/" + fileName))) {
		String line = read.readLine();
		int count = 0;
		while (line != null) {
		    if (!line.trim().equals(""))
			count++;
		    line = read.readLine();
		}
		System.out.println(
			"File " + fileName + " has " + count + " lines of text.");

	    } catch (FileNotFoundException fnf) {
		System.out.println("File not found:" + fnf);
	    } catch (IOException io) {
		System.out.println("IO exception: " + io);
	    }
	}

    }

}
