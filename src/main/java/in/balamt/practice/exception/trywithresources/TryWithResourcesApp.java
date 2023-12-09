package in.balamt.practice.exception.trywithresources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import in.balamt.practice.serialization.SerializationPractice;

public class TryWithResourcesApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		final String SER_FILE_PATH = SerializationPractice.class.getClassLoader().getResource("obj.txt").getPath();
		//We haven't used the catch or finally block
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE_PATH))) {
			oos.writeUTF("Hello Obj.txt writing");
			System.out.println("Done");
		}

	}

}
