package com.service;

import java.util.List;
import java.util.Optional;
import com.model.Users;

public interface UserService {
   Users save(Users users); // Save a user
   
   List<Users> getAll(); // Fetch all users
   
   Optional<Users> getById(String userId); // Fetch a single user by ID
}
