package com.webapplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webapplication.entity.User;
import com.webapplication.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	//public List<User> getAll()
	  //{
		//return userRepository.findAll();
	  //}
	
	// public List<User> getAllUsers() {
 //  return this.userRepositoy.findAll();
    //}
	
	public User saveUser(User user) {
		User user2=userRepository.save(user);
		return user2;	
	}

 //public User saveUser(User user) {
	//if(UserRepository.save(user).isEmpty())
	//throw new 
	//User user2=userRepository.save(user);
	//return user2;	
//}


}