package com.example.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tarifs")
public class Tarif {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;


    @NotNull
    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String tarifName;

    @NotNull
    @Column(name = "price", nullable = false)
    @Getter
    @Setter
    private int tarifPrice;

    @NotNull
    @Column(name = "type", nullable = false)
    @Getter
    @Setter
    private String tarifType;


    @Column(name = "context", nullable = false)
    @Getter
    @Setter
    private String tarifContext;

    public Tarif() { //mandatory!
    }

    public Tarif(String tarifName) {
        this.tarifName = tarifName;
    }

}


