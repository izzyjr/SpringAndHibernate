package com.mesa.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mesa.hibernate.test.entity.Employee;

public class DeleteEmployeeTest {
	
	public static void main(String[] args) {
	
		//create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session 
		Session session = factory.getCurrentSession();
		
		try {
			
			int employeeID = 3;
			
			// begin a transaction
			session.beginTransaction();
			
			// retrieving employee by primary key
			System.out.println("Getting employee with primary key: " + employeeID);
			
			Employee employee = session.get(Employee.class,employeeID);
			
			// delete employee
//			System.out.println("Deleting employee: " + employee);
//			session.delete(employee);
			
			// delete employee with id=4/ alternate approach
			System.out.println("Deleting employee id=4");
			
			session.createQuery("delete from Employee where id=4").executeUpdate();
			
			// commit transaction 
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}
		
	}
}
