package edu.rafael.accounts.service.impl;

import org.springframework.stereotype.Service;

import edu.rafael.accounts.dto.CustomerDto;
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
		// TODO Auto-generated method stub

	}

	public AccountsServiceImpl(AccountsRepository accountsRepository, CustomerRepository customerRepository) {
		super();
		this.accountsRepository = accountsRepository;
		this.customerRepository = customerRepository;
	}

}
