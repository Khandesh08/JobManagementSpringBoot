package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.externalService.HotelService;
import com.model.Hotel;
import com.model.Rating;
import com.model.Users;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Override
	public Users save(Users users) {
		
		return userRepository.save(users);
	}

	
	@Override
	public List<Users> getAll() {
		
		return userRepository.findAll();
	}

	// Use eureka
	
	//@Override
	public Optional<Users> getById(String userId) {
	   return userRepository.findById(userId).map(user -> {
	        // Fetch ratings for the user
	        Rating[] ratingsArray = restTemplate.getForObject("http://RATINGSERVICE/ratings/users/" + userId, Rating[].class);
	        List<Rating> ratings = ratingsArray != null ? Arrays.asList(ratingsArray) : new ArrayList<>();

	        //Fetch and set hotel details for each rating
	        ratings.forEach(rating -> 
	            rating.setHotel(restTemplate.getForObject("http://HOTELSERVICE/hotel/" + rating.getHotelId(), Hotel.class))
	        );

	        user.setRatings(ratings);
	        return user;
	    });
	}
	
	
	
	//feign
	// public Optional<Users> getById(String userId) {
	  //      return userRepository.findById(userId)
	       //     .map(user -> {
	     //           // Fetch hotel details directly (Assuming a user is linked to a single hotel)
	         //       Hotel hotel = hotelService.getHotel(userId);
	           //     user.setHotel(hotel);  // Assuming "Users" has a `hotel` field
	             //   return user;
	           // });
}
