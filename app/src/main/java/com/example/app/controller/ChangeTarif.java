package com.example.app.controller;

import com.example.app.model.Client;
import com.example.app.model.Tarif;
import com.example.app.service.AdminService;
import com.example.app.service.ClientService;
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
public class ChangeTarif {

    @Autowired
    private TarifService tarifService;

    @Autowired
    private ClientService clientService;


    @Transactional
    @RequestMapping(value = {"/changetarif"}, method = RequestMethod.GET)
    public String getClientOffice(@RequestParam(required = false) String login, String password, Model model) {


        List<Tarif> tarifs = tarifService.findAll();
        Client client = clientService.findUser(login,password);




        model.addAttribute("tarif",client.getClientTarif());
        model.addAttribute("balance",client.getClientBalance());
        model.addAttribute("name", client.getClientName());
        model.addAttribute("sname", client.getClientSname());
        model.addAttribute("password",password);
        model.addAttribute("login",login);

        model.addAttribute("list",tarifs);

        return "changetarif";
    }
}
