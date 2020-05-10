package com.sharansh.oauth.data.repositories;

import com.sharansh.oauth.data.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(String name);
}
