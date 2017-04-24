package com.freddyflo.springdemo.service;

import java.util.List;

import com.freddyflo.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);

}
