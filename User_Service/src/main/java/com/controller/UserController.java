package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Users;
import com.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController 
{
	@Autowired
	UserServiceImpl userServiceImpl;
 
   @PostMapping
   public Users post(@RequestBody Users users)
   {
	   return userServiceImpl.save(users);
   }
   
   @GetMapping
   public List<Users> getall()
   {
	   return userServiceImpl.getAll();
   }
   
   @GetMapping("/{userId}")
   public Optional<Users> getById(@PathVariable String userId) {
       return userServiceImpl.getById(userId);
   }
   
   
}
