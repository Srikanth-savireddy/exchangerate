package com.teksystems.exchangerate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

import com.teksystems.exchangerate.entity.ExchangeRate;
@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long>{
	
	
	@Query(value= "select * from exchangerate er where er.currency = :euro and datediff(currentDate,er.rateDate)<=60", nativeQuery = true)
    List<ExchangeRate> findByCurrency(String euro);

}
