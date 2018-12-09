package com.example.demorest.services;

import com.example.demorest.models.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendService extends CrudRepository<Friend, Integer> {

}
