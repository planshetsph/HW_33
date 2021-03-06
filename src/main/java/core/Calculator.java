package core;

public class Calculator {

	public static void main(String[] args) {
		divide(1, 0);
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	static int divide(int a, int b) {
		return a / b;
	}

	static double divide(double a, double b) {
		return a / b;
	}

	static double divide(double a, double b, double c) {
		return a / b / c;
	}

	static double divide(double a, double b, double c, double d) {
		return a / b / c / d;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double subtract(double a, double b, double c) {
		return a - b - c;
	}

	static double subtract(double a, double b, double c, double d) {
		return a - b - c - d;
	}

}
