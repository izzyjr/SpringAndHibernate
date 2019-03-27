package com.mesa.springdemo.service;

import java.util.List;

import com.mesa.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
