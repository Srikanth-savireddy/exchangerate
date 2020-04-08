package com.teksystems.exchangerate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksystems.exchangerate.entity.ExchangeRate;
import com.teksystems.exchangerate.repository.ExchangeRateRepository;

@Service
public class ExchangeRateService {
	
	@Autowired
	private ExchangeRateRepository exchangeRateRepository;

	public List<ExchangeRate> retrieveExchangeRates(String euro) throws Exception {
		List<ExchangeRate> exchangeRates = new ArrayList<>();
		try {
			 exchangeRates = exchangeRateRepository.findByCurrency(euro);
		} catch (Exception e) {
			throw new Exception();
		}
		return exchangeRates;

	}

	

}
