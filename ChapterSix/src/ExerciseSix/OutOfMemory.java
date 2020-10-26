package ExerciseSix;

public class OutOfMemory {

	public static void main(String[] args) {

		try {
			Car cars[] = new Car[1000000000];
			int i = 0;
			while (true) {
				cars[i] = new Car("BMW", 28);
				++i;
			}
		} catch (Throwable e) {
			System.out.println("Catched something!");
			System.out.println(e.toString());
		} finally {
			System.out.println("Done");
		}

	}

}
