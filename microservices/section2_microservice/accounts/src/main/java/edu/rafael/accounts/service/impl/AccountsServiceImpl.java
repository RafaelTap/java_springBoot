package edu.rafael.accounts.service.impl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import edu.rafael.accounts.constants.AccountsConstants;
import edu.rafael.accounts.dto.CustomerDto;
import edu.rafael.accounts.entity.Accounts;
import edu.rafael.accounts.entity.Customer;
import edu.rafael.accounts.exception.CustomerAlreadyExistsException;
import edu.rafael.accounts.mapper.CustomerMapper;
import edu.rafael.accounts.repository.AccountsRepository;
import edu.rafael.accounts.repository.CustomerRepository;
import edu.rafael.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;

@Service // this class is a service layer
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

	private AccountsRepository accountsRepository;
	private CustomerRepository customerRepository;

	@Override
	public void creatAccount(CustomerDto customerDto) {
		Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
		Optional<Customer> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
		if (optionalCustomer.isPresent()) {
			throw new CustomerAlreadyExistsException(
					"Customer alredy registered with given mobile number" + customerDto.getMobileNumber());
		}
		Customer savedCustomer = customerRepository.save(customer);
		accountsRepository.save(creatNewAccounts(savedCustomer));
	}

	public AccountsServiceImpl(AccountsRepository accountsRepository, CustomerRepository customerRepository) {
		super();
		this.accountsRepository = accountsRepository;
		this.customerRepository = customerRepository;
	}

	private Accounts creatNewAccounts(Customer customer) {
		Accounts newAccount = new Accounts();
		newAccount.setCustumerId(customer.getCustomerId());
		long randomAccNumber = 1000000000L + new Random().nextInt(90000000); // random id with 10 digits

		newAccount.setAccountNumber(randomAccNumber);
		newAccount.setAccountType(AccountsConstants.SAVINGS);
		newAccount.setBranchAddress(AccountsConstants.ADDRESS);
		return newAccount;
	}
}
