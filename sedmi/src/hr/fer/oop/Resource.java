package hr.fer.oop;

public class Resource implements AutoCloseable {
private int id;
public Resource(int id) {
this.id = id;
}
@Override
public void close() {
System.out.println("R" + id + " is now closed!");
}
}