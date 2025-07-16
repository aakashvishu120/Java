package methodOverloading;

public class Main {

	private static int findMin(int value1, int value2) {
		if (value1 > value2) {
			return value1;
		} else {
			return value2;
		}
	}

	private static double findMin(double value1, double value2) {
		if (value1 > value2) {
			return value1;
		} else {
			return value2;
		}
	}

	public static void main(String args[]) {
		int a = 10, b = 8;
		double c = 52.2, d = 52.1;

		int minIntValue = findMin(a, b);
		double minDoubleValue = findMin(c, d);
		
		System.out.println("min integer Value : " + minIntValue);
		System.out.println("min Double Value : " + minDoubleValue);
	}
}
