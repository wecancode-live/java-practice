package in.balamt.practice.serialization;

import java.io.IOException;

public class SerializationApp {

	public static void main(String[] areg) {
		SerializationPractice sPractice = new SerializationPractice();
		Employee model = new Employee();
		model.setEmpId(100);
		model.setName("BALA");
		model.setScore(200);
		sPractice.serializeModel(model);

		Employee deModel;
		try {
			deModel = sPractice.deserializeModel();
			if (deModel != null) {
				System.out.println("Name " + deModel.getName());
				System.out.println("Id " + deModel.getEmpId());
				System.out.println("[Due to transient the value is not serialized and/or deserialized] Score " + deModel.getScore());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
