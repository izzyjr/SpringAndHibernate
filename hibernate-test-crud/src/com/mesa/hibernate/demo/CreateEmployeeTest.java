package com.mesa.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mesa.hibernate.test.entity.Employee;

public class CreateEmployeeTest {
	
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
			Employee employee1 = new Employee("John", "Smith", "Coca-Cola");
			Employee employee2 = new Employee("Michael", "Black", "Samsung");
			Employee employee3 = new Employee("Peter", "Martin", "Microsoft");
			Employee employee4 = new Employee("Lina", "Mota", "Apple");
			
			// start a transaction
			session.beginTransaction();
			
			// save the Employee objects
			System.out.println("Saving the employees...");
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			session.save(employee4);
			
			// commit transaction 
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}
		
	}
}
