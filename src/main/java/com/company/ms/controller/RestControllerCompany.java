package com.company.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.ms.model.CustomerEntity;
import com.company.ms.service.ICustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("api")
public class RestControllerCompany {

	@Autowired
	ICustomerService customerImpl;

	
	@GetMapping("/getCompany")
	public Flux<CustomerEntity> getCompany() {		
		return customerImpl.allCustomersCompany();
	}
	
	@PostMapping("/postCompany")
	public Mono<CustomerEntity> postCompany(@RequestBody CustomerEntity customer){
		
		System.out.println(customer.getBusnam());
		return customerImpl.saveCustomer(customer);
	}
	
	@PutMapping("/updCompany")
	public Mono<CustomerEntity> updCompany(@RequestBody CustomerEntity customer){
		
		return customerImpl.updCustomer(customer);
	}
	
	@DeleteMapping("/dltCompany/{id}")
	public Mono<Void> dltCompany(@PathVariable final String id){
		
		return customerImpl.dltCustomer(id);
	}
}

