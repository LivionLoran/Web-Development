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

import java.util.List;

@Controller
public class Authorization {

    @Autowired
    private ClientService clientService;

    @Transactional
    @RequestMapping(value = {"/author"},method = RequestMethod.GET)
    public String getAuthorization() {

        return "authorize";
    }

    @Transactional
    @RequestMapping(value = {"/author"},method = RequestMethod.POST)
    public String postAuthorization(@RequestParam("login") String login, @RequestParam("password") String password, Model model) {


      Client client = clientService.findUser(login,password);

      if (client != null) {

          model.addAttribute("tarif", client.getClientTarif());
          model.addAttribute("balance", client.getClientBalance());
          model.addAttribute("name", client.getClientName());
          model.addAttribute("sname", client.getClientSname());
          model.addAttribute("password", password);
          model.addAttribute("login", login);


          return "office";
      } else {
          model.addAttribute("wrongdata", "Введенные вами данные неверны");
          return "authorize";
      }
    }
}
