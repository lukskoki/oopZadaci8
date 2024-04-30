package hr.fer.oop;

public class main {

	public static void main(String[] args) {
		CountableKeyValueMapEntry<String> c1 = new CountableKeyValueMapEntry<String>(1, "Dinamo");
		KeyValueMapEntry<Integer, String> c2 = new CountableKeyValueMapEntry<String>(9, "Varazdin");
		KeyValueMapEntry<Integer, String> c3 = new KeyValueMapEntry<Integer, String>(4, "Rijeka");	 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
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
