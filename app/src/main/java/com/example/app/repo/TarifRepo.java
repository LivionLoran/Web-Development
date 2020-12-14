package com.example.app.repo;

import com.example.app.model.Tarif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TarifRepo extends JpaRepository<Tarif, Integer> {

    @Query("SELECT b FROM  Tarif b  WHERE  id = :id")
    Tarif findById(@Param("id") int id);

    List<Tarif> findAll();

    void deleteById(int entityId);


}
