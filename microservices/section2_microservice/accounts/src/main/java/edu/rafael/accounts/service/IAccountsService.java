package edu.rafael.accounts.service;

import edu.rafael.accounts.dto.CustomerDto;

public interface IAccountsService {


	/**
	 * 
	 * @param customerDto - CustomerDto Object
	 */
	
	void creatAccount(CustomerDto customerDto); 

}
