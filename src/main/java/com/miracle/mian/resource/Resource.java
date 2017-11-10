package com.miracle.mian.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miracle.main.dao.CustomerRepository;
import com.miracle.main.model.Customer;



@RestController
@RequestMapping("/rest/users")
public class Resource {
	@Autowired
	CustomerRepository customerRepository;
	
	 @GetMapping("/all")
	    public List<Customer> getAll() {
	        return (List<Customer>) customerRepository.findAll();
	    }
	 @GetMapping("/{name}")
	    public List<Customer> getUser(@PathVariable("name") final String name) {
	        return customerRepository.findByName(name);

	    }
	
}
