package com.edrestapi.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edrestapi.bindingclasses.EdResponse;
import com.edrestapi.services.EdService;


@RestController
public class EdRestctroller {

	private EdService edService;

	public EdRestctroller(EdService edService) {
		this.edService = edService;
	}

	@GetMapping("/ed/{caseNum}")
	public ResponseEntity<EdResponse> determineEligibilty(@PathVariable("caseNum") Long caseNum) {
		return new ResponseEntity<EdResponse>(this.edService.determineEligibility(caseNum), HttpStatus.CREATED);
	}

}
