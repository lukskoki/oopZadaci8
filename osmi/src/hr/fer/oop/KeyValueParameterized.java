package hr.fer.oop;

public class KeyValueParameterized<K, V> {
	K key;
	V value;
	public KeyValueParameterized(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "KeyValueBasic [key=" + key + ", value=" + value + "]";
	}
}
