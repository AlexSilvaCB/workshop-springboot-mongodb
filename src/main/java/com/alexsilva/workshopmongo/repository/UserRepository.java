package com.alexsilva.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alexsilva.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, Long> {
	
}
