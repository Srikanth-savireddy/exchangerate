package com.teksystems.exchangerate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EXCHANGERATE")
public class ExchangeRate {
	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="CURRENCY")
	private String currency;
	@Column(name="RATEDATE")
	private Date rateDate;
	@Column(name="RATE")
	private Double rate;
	@Column(name="COUNTRY")
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
