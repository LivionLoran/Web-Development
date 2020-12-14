package com.example.app.repo;

import com.example.app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client, Integer> {


    //@Query("SELECT b FROM  Client b  WHERE  id = :id")
    @Query("SELECT id FROM  Client  id WHERE  (login = :loging) and (password = :passwordg) ")
    Client findUser(@Param("loging") String login, @Param("passwordg") String password );

    List<Client> findAll();

    void deleteById(int entityId);
}
