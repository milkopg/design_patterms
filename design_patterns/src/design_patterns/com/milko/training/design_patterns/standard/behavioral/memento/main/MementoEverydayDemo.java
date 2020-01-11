package design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.originator.Employee;

public class MementoEverydayDemo {

	private static void serialize(Employee emp) {
		try {
			FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Employee deseriaze() {
		Employee emp = null;
		
		try {
			FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee) in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Bryan Hansen");
		emp.setAddress("111 E Code Street");
		emp.setPhone("888-555-1212");
		
		serialize(emp);
		
		Employee newEmp = deseriaze();
		System.out.println(newEmp);
	}

}
