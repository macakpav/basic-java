package exeriseSix;

public class StringOperations {
	
	public static String reverse(String word) {
		String reversedWord="";
		for (int i = word.length()-1; i >= 0; i--) {
			reversedWord+=word.charAt(i);
		}
		return reversedWord;
	}
	
	public static boolean isPalindrome(String word) {
		return word.equals(reverse(word));
	}

	public static void main(String[] args) {
		String word="racecar";
		System.out.println(reverse(word));
		System.out.println("Is palindrome?: " + isPalindrome(word));
	}

}
