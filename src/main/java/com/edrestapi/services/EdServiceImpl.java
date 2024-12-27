package com.edrestapi.services;

import org.springframework.stereotype.Service;

import com.edrestapi.bindingclasses.EdResponse;
import com.edrestapi.repositories.EdRepositories;

@Service
public class EdServiceImpl implements EdService {

	private EdRepositories edRepositories;

	public EdServiceImpl(EdRepositories edRepositories) {
		this.edRepositories = edRepositories;
	}

	@Override
	public EdResponse determineEligibility(Long caseNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveNotice() {
		// TODO Auto-generated method stub
		return false;
	}

}
