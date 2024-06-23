package edu.rafael.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.rafael.accounts.constants.AccountsConstants;
import edu.rafael.accounts.dto.CustomerDto;
import edu.rafael.accounts.dto.ResponseDto;

@RestController
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })

/*
 * it means any REST api that i'm trying to implement inside this class. In real
 * project we can put the version of api, like /api/v1. produce = MediaType ->
 * for a good practice we need mention what return type data format from the
 * REST API, in this case is a JSON (APPLICATION_JSON_VALUE).
 */
public class AccountsController {

	@PostMapping(path = "/create") // because it's a create operation, we need to use the Http post method.
	public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));

	}
}
