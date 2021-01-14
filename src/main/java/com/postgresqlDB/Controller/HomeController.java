package com.postgresqlDB.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresqlDB.Dao.UserRepository;
import com.postgresqlDB.Model.User;

@RestController
public class HomeController {

	@Autowired UserRepository userRepo;
	
    @GetMapping("/")
    public String welcomePage(){
    	User user = new User();
    	user.setEmail("ajay@gmail.com");
    	user.setName("Ajay");
    	user.setPhone("8503158627");
    	
    	User save = userRepo.save(user);
    	
    	System.out.println("--------------"+save+"----------------");
    	
        return  "Welcome, to my page";
    }
    
    @GetMapping("/show")
    public List<User> showDetails(){
    	
    	List<User> findAll = userRepo.findAll();
    	
    	return findAll;
    	
    }
}
