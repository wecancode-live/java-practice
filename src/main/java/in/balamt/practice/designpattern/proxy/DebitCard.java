package in.balamt.practice.designpattern.proxy;	

import java.util.ArrayList;
import java.util.List;

public class DebitCard implements Cards {

	Cards visaCard = new VisaCard();
	private static List<String> validCardPattern;
	
	static {
		//Static block to prepare the pattern to verify card
		validCardPattern = new ArrayList<String>();
		validCardPattern.add("4321");
		validCardPattern.add("4123");
		validCardPattern.add("4312");
	}

	@Override
	public void processCard(String first4Digit) throws Exception {
		//Check whether first4Digit is available in the list
		if (!validCardPattern.contains(first4Digit)) {
			//If not available throw exception
			throw new Exception(first4Digit + " Not Visa Card");
		}
		//else process with visaCard class
		visaCard.processCard(first4Digit);
	}

}
