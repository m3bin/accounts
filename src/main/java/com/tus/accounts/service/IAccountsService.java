package com.tus.accounts.service;

import com.tus.accounts.dto.CustomerDto;

import lombok.AllArgsConstructor;


public interface IAccountsService {
	
	void createAccount(CustomerDto customerDto);
	CustomerDto fetchAccount(String mobileNumber);
	boolean updateAccount(CustomerDto customerDto);
	boolean deleteAccount(String mobileNumber);

}
