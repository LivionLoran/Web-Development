package com.example.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private int id;


    @NotNull
    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String clientName;

    @NotNull
    @Column(name = "sname", nullable = false)
    @Getter
    @Setter
    private String clientSname;

    @NotNull
    @Column(name = "password", nullable = false)
    @Getter
    @Setter
    private String clientPassword;


    @Column(name = "login", nullable = false)
    @Getter
    @Setter
    private String clientLogin;

    @NotNull
    @Column(name = "balance", nullable = false)
    @Getter
    @Setter
    private float clientBalance;

    @Column(name = "tarif")
    @Getter
    @Setter
    private String clientTarif;

    public Client() {
    }

    public Client(String clientName) {
        this.clientName = clientName;
    }

}

