package com.teksystems.exchangerate.model;

import java.util.Date;

public class ExchangeRate {
	
	private String currency;
	private Date rateDate; 
	private Double rate;
	private String country;
	
	public ExchangeRate() {

	}
	public ExchangeRate(String currency, Date rateDate, Double rate, String country) {
		this.currency = currency;
		this.rateDate = rateDate;
		this.rate = rate;
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getRateDate() {
		return rateDate;
	}
	public void setRateDate(Date rateDate) {
		this.rateDate = rateDate;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "ExchangeRate [currency=" + currency + ", rateDate=" + rateDate + ", rate=" + rate + ", country="
				+ country + "]";
	}
	

}
