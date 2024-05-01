package hr.fer.oop;

import java.nio.file.Paths;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r1 = new Resource(1);
		try {
		try (r1; Resource r2 = new Resource(2)) {
		System.out.println("try");
		Integer.parseInt("zero");
		
		} catch (NumberFormatException e) {
		
		throw new RuntimeException("wrapped exception", e);
		} finally {
		System.out.println("finally");
		}
		} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("cause"+e.getCause().getMessage());
		} finally {
		System.out.println("finally 2");
		}
	}

}
