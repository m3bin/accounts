package com.tus.accounts.service;

import com.tus.accounts.dto.CustomerDto;

import lombok.AllArgsConstructor;


public interface IAccountsService {
	
	void createAccount(CustomerDto customerDto);

}
