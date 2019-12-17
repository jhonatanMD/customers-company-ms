package com.company.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.ms.model.CustomerEntity;
import com.company.ms.repository.ICustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl  implements ICustomerService{

	@Autowired
	ICustomerRepository repository;
	
	@Override
	public Flux<CustomerEntity> allCustomersCompany() {
		
		return repository.findAll();
	}

	@Override
	public Mono<CustomerEntity> saveCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Mono<CustomerEntity> updCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Mono<Void> dltCustomer(String id) {
		// TODO Auto-generated method stub
		return repository.deleteById(id);
	}

}
