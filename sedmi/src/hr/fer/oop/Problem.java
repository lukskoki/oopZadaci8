package hr.fer.oop;

import java.util.Scanner;



public class Problem {

	public static void main(String[] args) {
		
		String[] input3 = { "a", "b", "c", null };
		exceptionalMethod(input3);
		
		problem01Incrementer("five");

		problem02Ping(null);

		problem03PrintGrade(new Person("John", "Bambo"));

		problem04PrintArray(args);

		String result = problem05Print();

	}
	
	private static void exceptionalMethod(String[] input) {
		String result = "";
		for (String string : input) {
			
			try {
				
			String upper = string.toUpperCase();
			result+=upper.toCharArray()[0];
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println(e.getMessage());
			} 
			finally {
				System.out.println("finally");
			}
		}
			
		System.out.println(result);
	}
	/**
	 * Converts a string to integer, increments a value and prints a message on
	 * System.out.
	 * 
	 * @param numberAsString
	 */
	private static void problem01Incrementer(String numberAsString) {
		System.out.println("problem01Incrementer()");
		
		try {
			int result = Integer.parseInt(numberAsString);
			result++;
			System.out.println("When we increment the number " + numberAsString + " we get: " + result);
		} catch (Exception e) {
			System.out.println("ne valja");
		}
		
	}

	/**
	 * Outputs the lines from the scanner. The method will terminate once the lines
	 * is equal to "q".
	 * 
	 * @param s
	 */
	private static void problem02Ping(Scanner s) {
		System.out.println("problem02Ping()");
		try {
			while (s.hasNext()) {
				
				String line = s.nextLine();
				if (line.equals("q")) {
					break;
				} else
					System.out.println(line);
			
		}
		} catch (Exception e) {
			System.out.println("null");
		}
		
	}

	/**
	 * Downcasts from person to student and prints the grade.
	 * 
	 * @param person
	 */
	private static void problem03PrintGrade(Person person) {
		System.out.println("problem03PrintGrade()");
		try {
			Student student = (Student) person;
			System.out.println("Grade: " + student.getGrade());
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Prints all the elements from an input array.
	 * 
	 * @param array
	 */
	private static void problem04PrintArray(String[] array) {
		System.out.println("problem04PrintArray()");

		for (int i = 0; i < 3; i++) {
			try {
			System.out.println(array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	/**
	 * Prints the "problem05Print()"
	 * 
	 * @return
	 */
	private static String problem05Print() {
		System.out.println("problem05Print()");

		return "problem05Print()";
	}

}