/**
 * 
 */
package exerciseSix;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/**
 * Write a program that reads in a simple text file and stores how many times
 * each word in that file occurs. You can decide upon how to parse the text in
 * the file, for example by making use of Java’s StringTokenizer class or
 * another approach. Make use of Java’s java.util.HashMap class in your
 * implementation:
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html
 * 
 * @author Pavel Mačák
 *
 */
public class WordCounter {

    public static void main(String[] args) {

	String fileName = "longText.txt";
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	try (BufferedReader read = new BufferedReader(
		new FileReader("src/exerciseSix/" + fileName))) {
	    String line = read.readLine();
	    String[] buf;
	    while (line != null) {
		buf = line.split("\\s");

		for (String word : buf) {
		    if (map.containsKey(word))
			map.replace(word, map.get(word) + 1);
		    else
			map.put(word, 1);
		}

		line = read.readLine();
	    }

	} catch (FileNotFoundException fnf) {
	    System.out.println("File not found: " + fnf);
	} catch (IOException io) {
	    System.out.println("Got an IO exception: " + io);
	}
	// print the words and their count
	Set<String> keySet = map.keySet();
	for (String word : keySet) {
	    System.out.println(
		    word + " occures " + map.get(word) + " times in " + fileName);
	}
    }

}
