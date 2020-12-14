package com.example.app.controller;

import com.example.app.service.TarifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteTarif {

    @Autowired
    private TarifService tarifService;


    @Transactional
    @RequestMapping(value = {"/delete"},method = RequestMethod.GET)
    public String getInfo(@RequestParam(required = false, defaultValue = "World") int id , String name, Model model) {
        String tarifname =  tarifService.findOne(id).getTarifName();
        tarifService.deleteById(id);

        model.addAttribute("name",tarifname);
        return "deletetarif";
    }



}
