// package com.example.demo.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.model.Customer;
// import com.example.demo.repository.CustomerRepository;

// @RestController
// @RequestMapping("/api/v1/customer")
// public class CustomerWebServices {
	
// 	@Autowired
// 	private CustomerRepository repository;
	
// 	@RequestMapping(value = "/add", method = RequestMethod.POST)
// 	public String addMember(@RequestBody Customer customer) {	
// 		System.out.println(customer.toString());
// 		repository.save(customer);
// 		return "success";			
// 	}

// }
