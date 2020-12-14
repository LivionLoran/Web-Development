package com.example.app.service;
import com.example.app.model.Tarif;
import com.example.app.repo.TarifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifServiceImpl implements TarifService {

    @Autowired
    private TarifRepo dao;

    @Override
    public Tarif findOne(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Tarif> findAll() {
        return dao.findAll();
    }

    @Override
    public Tarif create(Tarif entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public Tarif update(Tarif entity) {
        return dao.saveAndFlush(entity);
    }

    @Override
    public void deleteById(int entityId) {
        dao.deleteById(entityId);
    }
}
