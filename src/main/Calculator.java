package main;

public class Calculator {
	
	public static String factorial(String input) {
		int n = Integer.parseInt(input);
		long fact = 1;
		if (n == 0 || n == 1) {
			return Long.toString(fact);
		}
		else {
			for (int i = n; i > 0; i--) {
				fact = fact * i;
			}
			return Long.toString(fact);
		}
	}
	
	public static String validateInput(String input) {
		if (input.equals("") || !input.matches("\\d+")) {
			return "Invalid form";
		}
		else {
			return factorial(input);
		}
	}

}
