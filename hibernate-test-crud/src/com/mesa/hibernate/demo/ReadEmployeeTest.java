package com.mesa.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mesa.hibernate.test.entity.Employee;

public class ReadEmployeeTest {
	
	public static void main(String[] args) {
	
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session 
		Session session = factory.getCurrentSession();
		
		try {
			
			// create Employee objects
			System.out.println("Creating Employees...");
			Employee employee1 = new Employee("Mario", "Perry", "Toyota");
			
			// start a transaction
			session.beginTransaction();
			
			// save the Employee objects
			System.out.println("Saving employee...");
			session.save(employee1);
			
			// commit transaction 
			session.getTransaction().commit();
			System.out.println("Done!");
			
			// NEW CODE
			
			// create new session 
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// find out the Employee's id: primary key
			System.out.println("Saved employee. Generated id: " + employee1.getId());
			
			Employee employeeDB = session.get(Employee.class, employee1.getId());
			
			System.out.println("Get complete: " + employeeDB);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
	}
}
