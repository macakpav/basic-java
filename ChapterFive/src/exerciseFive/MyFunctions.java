package exerciseFive;

import java.util.ArrayList;

public class MyFunctions {

	public static int f(int x) {
		if (x < 0) {
			return -1;
		}

		int total = 1;
		int i = 1;
		while (i < x) {
			i++;
			total = total * i;
		}
		return total;
	}

	public static ArrayList<Integer> fList(int y) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < y+1; i++) {
			list.add(f(i));
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(fList(5));
	}

}
