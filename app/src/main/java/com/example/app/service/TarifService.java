package com.example.app.service;

import com.example.app.model.Client;
import com.example.app.model.Tarif;

import java.util.List;

public interface TarifService {

    Tarif findOne(int id);

    List<Tarif> findAll();

    Tarif create(Tarif entity);

    Tarif update(Tarif entity);


    void deleteById(int entityId);

}
