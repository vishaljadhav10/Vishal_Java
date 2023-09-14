package com.gl.methodsQuestion1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.gl.beanQuestion1.Employee;
import com.gl.beanQuestion1.Project;

public class Method {

	public void serialization(HashMap<Project, ArrayList<Employee>> x) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Java\\GradedQ1");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try (fos; oos) {
			oos.writeObject(x);
			System.out.println("Serialized map of project successfully");
		}
	}

	public void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\Java\\GradedQ1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try (fis; ois) {

//			Object o = ois.readObject();
//			System.out.println(o);

			HashMap<Project, ArrayList<Employee>> hash = (HashMap<Project, ArrayList<Employee>>) ois.readObject();
			for (Project key : hash.keySet()) {
				ArrayList<Employee> value = hash.get(key);
				System.out.println("For project");
				System.out.println(key);
				System.out.println("Has the following employees");
				// System.out.println(value);
				for (Employee e : value) {
					System.out.println(e);
				}
				System.out.println();
			}
		}
	}
}
