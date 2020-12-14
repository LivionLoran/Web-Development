package com.example.app.controller;

import com.example.app.model.Client;
import com.example.app.model.Tarif;
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
public class ChangeTarifImpl {

    @Autowired
    private ClientService clientService;

    @Autowired
    private TarifService tarifService;

    @Transactional
    @RequestMapping(value = {"/changetarifimpl"}, method = RequestMethod.GET)
    public String getClientOffice(@RequestParam(required = false) String login, String password, int id, Model model) {

        Client client = clientService.findUser(login,password);
        Tarif tarif = tarifService.findOne(id);

        client.setClientTarif(tarif.getTarifName());

        clientService.update(client);

        model.addAttribute("tarif",client.getClientTarif());
        model.addAttribute("balance",client.getClientBalance());
        model.addAttribute("name", client.getClientName());
        model.addAttribute("sname", client.getClientSname());
        model.addAttribute("password",password);
        model.addAttribute("login",login);

        return "office";
    }
}
