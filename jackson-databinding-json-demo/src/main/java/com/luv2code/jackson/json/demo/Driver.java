package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// create the object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to Java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			//print first name and last name
			System.out.println("Student - First name: " + theStudent.getFirstName());
			System.out.println("Student - Last name: " + theStudent.getLastName());
			
			// read JSON file and map/convert to Java POJO: data/sample-lite.json
			Person person = mapper.readValue(new File("data/sample-full.json"), Person.class);
						
			//print first name and last name
			System.out.println("First name: " + person.getFirstName());
			System.out.println("Last name: " + person.getLastName());
			
			//print out address: street and city
			System.out.println("Street: " + person.getAddress().getStreet());
			System.out.println("City: " + person.getAddress().getCity());
			
			//print out languages
			for (String tempLanguages : person.getLanguages()) {
				System.out.println(tempLanguages);
			}
			
			
		} 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
	
}
