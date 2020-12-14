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
public class Registration {

    @Autowired
    private ClientService clientService;

    @Transactional
    @RequestMapping(value = {"/registr"},method = RequestMethod.GET)
    public String getRegistration() {

        return "registration";
    }

    @Transactional
    @RequestMapping(value = {"/registr"},method = RequestMethod.POST)
    public String postRegistration(@RequestParam("login") String login,
                                   @RequestParam("password") String password,
                                   @RequestParam("name") String name,
                                   @RequestParam("sname") String sname,
                                   @RequestParam("tarif") String tarif,
                                   Model model) {

        Client client = new Client();

        client.setClientName(name);
        client.setClientSname(sname);
        client.setClientLogin(login);
        client.setClientPassword(password);
        client.setClientTarif(tarif);

        clientService.create(client);


        model.addAttribute("tarif","");
        model.addAttribute("balance",0);
        model.addAttribute("name", client.getClientName());
        model.addAttribute("sname", client.getClientSname());
        model.addAttribute("password",password);

        return "office";
    }
}
