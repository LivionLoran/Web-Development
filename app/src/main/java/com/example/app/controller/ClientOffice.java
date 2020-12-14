package com.example.app.controller;

import com.example.app.model.Client;
import com.example.app.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientOffice {

    @Autowired
    private ClientService clientService;


    @Transactional
    @RequestMapping(value = {"/office"}, method = RequestMethod.GET)
    public String getClientOffice(@RequestParam(required = false) String login, String password,
                                  String name, Model model) {

        Client client = clientService.findUser(login,password);




        model.addAttribute("tarif",client.getClientTarif());
        model.addAttribute("balance",client.getClientBalance());
        model.addAttribute("name", client.getClientName());
        model.addAttribute("sname", client.getClientSname());
        model.addAttribute("password",password);
        model.addAttribute("login",login);

        return "office";
    }
}