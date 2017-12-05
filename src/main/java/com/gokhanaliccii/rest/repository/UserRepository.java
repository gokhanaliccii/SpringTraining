package com.gokhanaliccii.rest.repository;

import com.gokhanaliccii.rest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
