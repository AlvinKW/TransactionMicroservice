package com.udacity.Transaction.repository;

import com.udacity.Transaction.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
