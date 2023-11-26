package com.fzamudio.employeeplatform.repositories;

import com.fzamudio.employeeplatform.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findByEmail(String email);

}
