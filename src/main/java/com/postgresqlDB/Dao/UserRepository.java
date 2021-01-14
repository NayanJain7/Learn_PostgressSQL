package com.postgresqlDB.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgresqlDB.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
