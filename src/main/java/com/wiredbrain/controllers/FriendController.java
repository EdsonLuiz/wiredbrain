package com.wiredbrain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wiredbrain.models.Friend;
import com.wiredbrain.services.FriendService;

@RestController
public class FriendController {
	
	 @Autowired
	 FriendService friendService;
	 
	 @PostMapping("/friend")
	 Friend create (@RequestBody Friend friend) {
		 return friendService.save(friend);
	 }
	 
	 @GetMapping("/friend")
	 Iterable<Friend> read() {
		 return friendService.findAll();
	 }
	 
	 @PutMapping("/friend")
	 Friend update(@RequestBody Friend friend) {
		 return friendService.save(friend);
	 }
	 
	 @DeleteMapping("/friend/{id}")
	 void delete(@PathVariable Integer id) {
		 friendService.deleteById(id);
	 }

}














