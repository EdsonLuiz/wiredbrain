package com.wiredbrain.services;

import org.springframework.data.repository.CrudRepository;

import com.wiredbrain.models.Friend;

public interface FriendService extends CrudRepository<Friend, Integer> {

}