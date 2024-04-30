package hr.fer.oop;

public class main {

	public static void main(String[] args) {
		System.out.println((1+2+3+1)/3.);
		
		
	}
	
	public static <K extends Number, V> double calculateAverageKey(KeyValueMapEntry<K, V> ...entries) {
		int sum = 0;
		int counter = 0;
		for (KeyValueMapEntry<K, V> entry: entries) {
			sum += entry.getKey().doubleValue();
			counter++;
			
		}
		return sum/counter;
		
	}

}
