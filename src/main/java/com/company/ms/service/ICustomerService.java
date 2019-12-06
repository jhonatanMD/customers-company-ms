package com.company.ms.service;



import com.company.ms.model.CustomerEntity;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerService {

	Flux<CustomerEntity> allCustomersCompany();
	
	Mono<CustomerEntity> saveCustomer(final CustomerEntity customer);
	
	Mono<CustomerEntity> updCustomer(final CustomerEntity customer);
	
	Mono<Void> dltCustomer(String id);
	
	
}
