package com.company.ms.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.company.ms.model.CustomerEntity;

@Repository
public interface ICustomerRepository extends ReactiveMongoRepository<CustomerEntity, String> {

}
