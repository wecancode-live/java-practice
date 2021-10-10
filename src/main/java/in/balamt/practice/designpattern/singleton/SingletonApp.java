package in.balamt.practice.designpattern.singleton;

public class SingletonApp {
	
	public static void main(String[] args) {
		//Create object for Singleton class and get the instance to return the object
		DAOUtil dbUtil = DAOUtil.getInstance();
		
		//Call the non-static method of the object
		dbUtil.printConnectionURL();
	}

}
