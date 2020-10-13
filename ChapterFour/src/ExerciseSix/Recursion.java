package ExerciseSix;

public class Recursion {

	static public int fib(int n) {
	    if(n <= 1) {
	        return n;
	    } else {
	        return fib(n - 1) + fib(n - 2);
	    }
	}
	
	static public int factorial(int n) {
		if (n==1 || n==0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(5));
		System.out.println(factorial(10));
	}
}
