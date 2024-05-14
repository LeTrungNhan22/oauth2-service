package com.snow.oauth2.socialoauth2.repository;

import com.snow.oauth2.socialoauth2.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
