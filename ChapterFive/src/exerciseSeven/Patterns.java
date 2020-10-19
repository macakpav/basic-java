package exerciseSeven;

public class Patterns {
	public static void upperTriangle(int num) {
		for (int i = num; i > 0; i--) {
			printAsterix(i);
			newLine();
		}
	}

	public static void lowerTriangle(int num) {
		for (int i = 0; i < num; i++) {
			printSpace(num-i-1);
			printAsterix(i);
			newLine();
		}
	}

	public static void diamond(int num) {
		int longest=1+2*(num-1), n, spaces;
		for (int i = 0; i < num; i++) {
			n = 1+i*2;
			spaces = (longest-n)/2;
			printSpace(spaces);
			printAsterix(n);
			printSpace(spaces);
			newLine();
		}
		for (int i = num-2; i >= 0; i--) {
			n = 1+i*2;
			spaces = (longest-n)/2;
			printSpace(spaces);
			printAsterix(n);
			printSpace(spaces);
			newLine();
		}
	}
	
	public static void printSpace(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printAsterix(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}

	public static void newLine() {
		System.out.print("\n");
	}

	public static void main(String [] args){
		lowerTriangle(10);
		newLine();
		upperTriangle(3); 
		newLine();
		diamond(6);
	}

}
