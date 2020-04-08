package com.teksystems.exchangerate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teksystems.exchangerate.entity.ExchangeRate;
import com.teksystems.exchangerate.service.ExchangeRateService;
import com.teksystems.exchangerate.service.UserService;

@RestController
public class ExchangeRateController {

	@Autowired
	private ExchangeRateService exchangeRateService;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/exchangerate/{euro}", method = RequestMethod.GET)
	public ResponseEntity<Object> status(@RequestHeader("userid") String userid,
			@RequestHeader("password") String password, @PathVariable("euro") String euro) throws Exception {
		
		userService.checkUser(userid, password);
		List<ExchangeRate> exchangeRates = exchangeRateService.retrieveExchangeRates(euro);

		return new ResponseEntity<>(exchangeRates, HttpStatus.OK);
	}

}
