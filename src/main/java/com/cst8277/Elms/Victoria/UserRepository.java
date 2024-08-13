package com.cst8277.Elms.Victoria;

import org.springframework.data.repository.CrudRepository;
import com.cst8277.Elms.Victoria.User;
import java.util.Optional;


public interface UserRepository extends CrudRepository<User,Integer> {
    //Optional<User> findByUserid(String userid);
}

