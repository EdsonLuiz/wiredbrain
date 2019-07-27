package com.wiredbrain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.wiredbrain.services.FriendService;

@RestController
public class FriendController {
	
	 @Autowired
	 FriendService friendService;

}
