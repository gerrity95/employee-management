package com.example.mark.employeemanager.DB_Classes.DB_Repositories;

import com.example.mark.employeemanager.DB_Classes.DB_Models.User;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}