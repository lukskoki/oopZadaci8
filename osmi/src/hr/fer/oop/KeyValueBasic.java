package hr.fer.oop;

public class KeyValueBasic {
	int key;
	String value;
	public KeyValueBasic(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "KeyValueBasic [key=" + key + ", value=" + value + "]";
	}
	
	
}
