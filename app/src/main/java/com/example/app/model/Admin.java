package com.example.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;


    @NotNull
    @Column(name = "password", nullable = false)
    @Getter
    @Setter
    private String adminPassword;


    @Column(name = "login", nullable = false)
    @Getter
    @Setter
    private String adminLogin;



    public Admin() {
    }



}
