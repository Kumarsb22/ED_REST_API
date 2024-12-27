package com.edrestapi.services;

import com.edrestapi.bindingclasses.EdResponse;

public interface EdService {

	public EdResponse determineEligibility(Long caseNum);
	
	public boolean saveNotice();
}
