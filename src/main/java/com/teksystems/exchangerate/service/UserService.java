package com.teksystems.exchangerate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksystems.exchangerate.entity.User;
import com.teksystems.exchangerate.exception.ResourceNotFoundException;
import com.teksystems.exchangerate.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

	public void checkUser(String userid,String password) throws Exception {
		
		try {
			User user=userRepository.findByUserid(userid);
			if(null == user) {
				throw new ResourceNotFoundException("InvalidUser", "V001");
			}
		} catch (Exception e) {
			throw new Exception();
		}
		

	}

	
}
