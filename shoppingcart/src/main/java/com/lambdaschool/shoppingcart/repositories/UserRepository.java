package com.lambdaschool.shoppingcart.repositories;

import com.lambdaschool.shoppingcart.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository
        extends CrudRepository<User, Long>
{
    User findByUsername(String username);

    List<User> findByUsernameContainingIgnoreCase(String name);
}
