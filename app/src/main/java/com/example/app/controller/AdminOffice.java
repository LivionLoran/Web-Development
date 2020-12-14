package com.example.app.controller;

import com.example.app.model.Tarif;
import com.example.app.service.AdminService;
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
public class AdminOffice {

    @Autowired
    private TarifService tarifService;


    @Transactional
    @RequestMapping(value = {"/adminoffice"}, method = RequestMethod.GET)
    public String getClientOffice(@RequestParam(required = false) String name, Model model) {

        List<Tarif> tarifs = tarifService.findAll();

        model.addAttribute("list",tarifs);

        return "adminOffice";
    }
}
