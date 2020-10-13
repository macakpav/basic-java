package exerciseFour;

import java.util.ArrayList;

public class Prime {

	public static ArrayList<Integer> getFirstPrimesUsingForLoops(int nbPrimes) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		boolean isPrime;

		for (int i = 3; primeNumbers.size() < nbPrimes; i++) {
			isPrime = true;
			for (int j = (int) Math.sqrt(i) + 1; j >= 2; j--) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNumbers.add(i);
			}
		}

		return primeNumbers;
	}

	public static ArrayList<Integer> getFirstPrimesUsingWhileLoops(int nbPrimes) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		boolean isPrime;
		int i = 3;
		int j;
		while (primeNumbers.size() < nbPrimes) {
			isPrime = true;
			j=(int) Math.sqrt(i) + 1;

			while (j >= 2) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
				j--;
			}
			if (isPrime) primeNumbers.add(i);
			i++;
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		int noPrimes=12;
		ArrayList<Integer> list = getFirstPrimesUsingForLoops(noPrimes);
		System.out.println(list);
		list = getFirstPrimesUsingWhileLoops(noPrimes);
		System.out.println(list);
	}

}
