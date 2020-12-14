package com.example.app.controller;

import com.example.app.model.Tarif;
import com.example.app.service.TarifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CreateUpdateTarif {


    @Autowired
    private TarifService tarifService;

    public static int Id;

    @Transactional
    @RequestMapping(value = {"/createupdate"},method = RequestMethod.GET)
    public String getCreateUpdateTarif(@RequestParam(required = false, defaultValue = "World") int id, Model model) {
        Id=id;
        if (id != 0) {
        Tarif tarif = tarifService.findOne(id);

        String name = tarif.getTarifName();
        String type = tarif.getTarifType();
        String context = tarif.getTarifContext();
        int price = tarif.getTarifPrice();

        model.addAttribute("name",name);
        model.addAttribute("type",type);
        model.addAttribute("context",context);
        model.addAttribute("price",price);  }

        return "createupdatetarif";
    }

    @Transactional
    @RequestMapping(value = {"/createupdate"},method = RequestMethod.POST)
    public String postCreateTarif(@RequestParam("name") String name, @RequestParam("price") int price,
                                  @RequestParam("type") String type,  @RequestParam("context") String context,
                                  Model model) {
        if (Id == 0) {
            List<Tarif> tarifs = tarifService.findAll();
            Tarif tarif = new Tarif();
            tarif.setTarifName(name);
            tarif.setTarifPrice(price);
            tarif.setTarifContext(context);
            tarif.setTarifType(type);
            tarif.setId(tarifs.size()+1);
            tarifService.create(tarif);

        }   else {
            Tarif tarif = tarifService.findOne(Id);
            tarif.setTarifName(name);
            tarif.setTarifPrice(price);
            tarif.setTarifContext(context);
            tarif.setTarifType(type);
            tarifService.update(tarif);
        }

        List<Tarif> tarifs = tarifService.findAll();

        model.addAttribute("list",tarifs);
        return "adminOffice";
    }
}
