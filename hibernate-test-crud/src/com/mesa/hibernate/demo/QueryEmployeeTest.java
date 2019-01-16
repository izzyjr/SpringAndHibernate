package com.mesa.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mesa.hibernate.test.entity.Employee;

public class QueryEmployeeTest {
	
	public static void main(String[] args) {
	
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session 
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query employees
			List<Employee> theEmployees = session.createQuery("from Employee").getResultList();
			
			// display employees
			displayEmployees(theEmployees);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}
		
	}

	private static void displayEmployees(List<Employee> theEmployees) {
		for (Employee tempEmployee: theEmployees) {
			System.out.println(tempEmployee);
		}
	}
}
