package hr.fer.oop;

public class KeyValueMapEntry<K, V> implements java.util.Map.Entry<K, V> {
	private K key;
	private V value;
	
	public KeyValueMapEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	public V setValue(V value) {
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}
	@Override
	public String toString() {
		return "KeyValueBasic [key=" + key + ", value=" + value + "]";
	}

}
