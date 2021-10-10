package in.balamt.practice.logical.vendingmachine;

public class ItemNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ItemNotFound(String message) {
		super(message);
	}

	ItemNotFound(String message, Exception e) {
		super(message, e);
	}

}
