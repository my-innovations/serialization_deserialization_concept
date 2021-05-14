package com.greenlearner.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDeserializableDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee("");
		emp.setId(101);
		emp.setName("Arvind");
		emp.setAddress("Noida");
		emp.setCategory("TEMP");
		emp.setDepartment("IT");

		System.out.println("Actual emp - " + emp);

		File file = new File("arvind.ser");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

		// storing the object to file
		oos.writeObject(emp);

		emp.setName("Green Learner");
		emp.setDepartment("New IT");

		// read the object from file.
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee employee = (Employee) ois.readObject();
		System.out.println("Deserialized emp - " + employee);

	}
}
