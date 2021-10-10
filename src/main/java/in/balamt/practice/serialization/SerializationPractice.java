package in.balamt.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPractice {

	private static final String SER_FILE_PATH = "E:\\dev\\temp\\obj.txt";

	public void serializeModel(Employee employee) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE_PATH))) {
			oos.writeObject(employee);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Employee deserializeModel() throws IOException {
		Employee address = null;
		ObjectInputStream objectinputstream = null;
		FileInputStream streamIn = null;
		try {
			streamIn = new FileInputStream(SER_FILE_PATH);
			objectinputstream = new ObjectInputStream(streamIn);
			address = (Employee) objectinputstream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (objectinputstream != null) {
				objectinputstream.close();
			}

			if (streamIn != null) {
				streamIn.close();
			}
		}
		return address;

	}

}
