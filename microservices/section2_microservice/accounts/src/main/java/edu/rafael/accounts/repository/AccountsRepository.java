package edu.rafael.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rafael.accounts.entity.Accounts;

@Repository // create a bean implementation of this interface based upon configuration that
			// i provided
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	// the parameters are the class that represent the entity Customer.
	// with JpaRepository, isn't necessary write any sql code for all CRUD
	// operation.

}
