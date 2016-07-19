package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.User;
import com.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserRepository userRepository;
	
	    @Override
		public User create(User user) {
			User savedGreeting = userRepository.save(user);//(greeting);
			return savedGreeting;
		}

}
