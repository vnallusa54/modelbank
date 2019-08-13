package com.ing.modelbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ing.modelbank.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	@Query("select t from Transaction t where t.account.accountId=?1")
	List<Transaction> findByAccountId(Long accountId);
	
}
