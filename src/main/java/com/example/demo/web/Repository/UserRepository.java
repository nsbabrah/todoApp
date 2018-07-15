package com.example.demo.web.Repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.web.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
