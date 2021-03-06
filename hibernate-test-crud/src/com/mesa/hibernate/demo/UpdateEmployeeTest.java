package com.mesa.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mesa.hibernate.test.entity.Employee;

public class UpdateEmployeeTest {
	
	public static void main(String[] args) {
	
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session 
		Session session = factory.getCurrentSession();
		
		try {
			
			// employee ID
			int employeeID = 2;
			
			// begin new session
			session.beginTransaction();
			
			// retrieving employee by primary key
			System.out.println("Getting employee with primary key: " + employeeID);
			
			Employee employee = session.get(Employee.class, employeeID);
			
			// updating employee's company
			employee.setCompany("Acme");
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		}
		finally {
			factory.close();
		}
		
	}

}
