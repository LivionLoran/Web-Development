package com.example.app.repo;

import com.example.app.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepo extends JpaRepository<Admin, Integer> {


    //@Query("SELECT b FROM  Client b  WHERE  id = :id")
    @Query("SELECT id FROM  Admin  id WHERE  (login = :loging) and (password = :passwordg) ")
    Admin findUser(@Param("loging") String login, @Param("passwordg") String password );

    List<Admin> findAll();

    void deleteById(int entityId);
}
