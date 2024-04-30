package hr.fer.oop;

public class CountableKeyValueMapEntry<V> extends KeyValueMapEntry<Integer, V> {
	private static int counter = 0;
	
	private int id;
	
	public CountableKeyValueMapEntry(Integer key, V value) {
		super(key, value);
		id = counter++;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return super.toString() + "CountableKeyValueMapEntry [id=" + id + "]";
	}
	
	
}
