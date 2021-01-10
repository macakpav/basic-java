package exerciseTwo;

import java.util.Arrays;

public class PlayerAnalyser {

	public static int minGoalsScored(int[] nbGoalsScored) {
		int min = nbGoalsScored[0];
		for (int i = 1; i < nbGoalsScored.length; i++) {
			if (min > nbGoalsScored[i]) {
				min = nbGoalsScored[i];
			}
		}
		return min;
	}

	public static int maxGoalsScored(int[] nbGoalsScored) {
		int max = nbGoalsScored[0];
		for (int i = 1; i < nbGoalsScored.length; i++) {
			if (max < nbGoalsScored[i]) {
				max = nbGoalsScored[i];
			}
		}
		return max;
	}

	public static double meanGoalsScored(int[] nbGoalsScored) {
		int len = nbGoalsScored.length;
		double sumGoals = 0;
		for (int i = 0; i < len; i++) {
			sumGoals += nbGoalsScored[i];
		}
		return sumGoals / len;
	}

	public static double medianGoalsScored(int[] nbGoalsScored) {
		// Arrays.sort sorts a given list in ascending order
		Arrays.sort(nbGoalsScored);
		int len = nbGoalsScored.length;
		if (len % 2 == 0) {
			return (nbGoalsScored[len / 2 - 1] + nbGoalsScored[len / 2]) / 2.0;
		}
		return nbGoalsScored[len / 2];
	}

	public static void main(String[] args) {
		int[] goals = { 1, 2, 2, 3, 3 };
		System.out.println(medianGoalsScored(goals));
		System.out.println(meanGoalsScored(goals));
		System.out.println(maxGoalsScored(goals));
		System.out.println(minGoalsScored(goals));
	}
}
