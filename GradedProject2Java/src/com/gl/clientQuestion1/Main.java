package com.gl.clientQuestion1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.gl.beanQuestion1.Employee;
import com.gl.beanQuestion1.Project;
import com.gl.methodsQuestion1.Method;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		ArrayList<Employee> list2 = new ArrayList<Employee>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();

		HashMap<Project, ArrayList<Employee>> map1 = new HashMap<Project, ArrayList<Employee>>();
//		HashMap<Project, ArrayList<Employee>> map2 = new HashMap<Project, ArrayList<Employee>>();
//		HashMap<Project, ArrayList<Employee>> map3 = new HashMap<Project, ArrayList<Employee>>();

		Project project1 = new Project("P1", "Music Synthesizer", 23);
		Project project2 = new Project("P2", "Vehicle Movement Tracker", 13);
		Project project3 = new Project("P3", "Liquid Viscosity Finder", 15);

		Employee e1 = new Employee("E001", "Harsha", "9383993933", "RTNagar", 1000);
		Employee e2 = new Employee("E002", "Harish", "9354693933", "Jayanagar", 2000);
		Employee e3 = new Employee("E003", "Meenal", "9383976833", "Malleswaram", 1500);
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);

		Employee e4 = new Employee("E004", "Sundar", "9334593933", "Vijayanagar", 3000);
		Employee e5 = new Employee("E005", "Suman", "9383678933", "Indiranagar", 2000);
		Employee e6 = new Employee("E006", "Suma", "9385493933", "KRPuram", 1750);
		list2.add(e4);
		list2.add(e5);
		list2.add(e6);

		Employee e7 = new Employee("E007", "Chitra", "9383978933", "Koramangala", 4000);
		Employee e8 = new Employee("E008", "Suraj", "9383992133", "Malleswaram", 3000);
		Employee e9 = new Employee("E009", "Manu", "9345193933", "RTNagar", 2000);
		list3.add(e7);
		list3.add(e8);
		list3.add(e9);

		map1.put(project1, list1);
		map1.put(project2, list2);
		map1.put(project3, list3);

		Method obj = new Method();
		try {
			obj.serialization(map1);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
		
			obj.deserialization();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
