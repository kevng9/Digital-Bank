package io.demo.bank.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.demo.bank.model.TransactionType;



public interface TransactionTypeRepository extends CrudRepository<TransactionType, Long> {
	
	TransactionType findByName (String name);
	TransactionType findByCode (String code);
	
	List<TransactionType> findAll();

}
