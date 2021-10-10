package in.balamt.practice.designpattern.proxy;

public class VisaCard implements Cards {

	@Override
	public void processCard(String first4Digit) throws Exception {
		System.out.println("Processing the card " + first4Digit);
	}

}
