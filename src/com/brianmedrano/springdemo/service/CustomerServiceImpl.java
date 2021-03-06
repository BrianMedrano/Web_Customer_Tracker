package com.brianmedrano.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brianmedrano.springdemo.dao.CustomerDAO;
import com.brianmedrano.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerDAO {

	
	//need to inject customer dao 
	@Autowired
	private CustomerDAO customerDAO; 
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

}
