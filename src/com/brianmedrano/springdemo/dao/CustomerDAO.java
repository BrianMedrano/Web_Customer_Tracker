package com.brianmedrano.springdemo.dao;

import java.util.List;

import com.brianmedrano.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
}
