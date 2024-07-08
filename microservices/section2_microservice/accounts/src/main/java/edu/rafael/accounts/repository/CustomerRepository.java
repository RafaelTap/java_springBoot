package edu.rafael.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.rafael.accounts.entity.Customer;

@Repository // create a bean implementation of this interface based upon configuration that
			// i provided.
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// the parameters are the class that represent the entity Customer.
	// with JpaRepository, isn't necessary write any sql code for all CRUD
	// operation.

	Optional<Customer> findByMobileNumber(String mobileNumber); // when use "findBy" we're telling to spring data JPA
																// that we
																// are trying to run a selected query using the column
																// mobileNumber (take a care to use the same name of
																// atribute of the pojo class). if are two or ore more
																// columns we need write: "findBy" + column name + "and"
																// + "column name and write the parameters. It's not
																// case sensitive, so don't
																// worry about that.

}
