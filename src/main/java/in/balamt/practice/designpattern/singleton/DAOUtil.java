package in.balamt.practice.designpattern.singleton;

import in.balamt.practice.util.JavaPracticeUtils;

public class DAOUtil {

	// Private Constructor to stop creating object outside of this class
	private DAOUtil() {
	}

	private static DAOUtil dbConnection;

	// By Calling this method an Single instance of this class is returned.
	public static synchronized DAOUtil getInstance() {
		if (dbConnection == null) {
			dbConnection = new DAOUtil();
		}
		return dbConnection;
	}

	public void printConnectionURL() {
		JavaPracticeUtils.printLine("mysql:jdbc://localhost:3306/");
	}
}
