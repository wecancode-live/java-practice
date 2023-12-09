package in.balamt.practice.exception.suppressedexceptions;

public class SuppressedResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		throw new ArrayIndexOutOfBoundsException("Index is missing");
	}
	
	public void readFromresource() {
		throw new RuntimeException("Custome method throwing runtime exceptions");
	}

}
