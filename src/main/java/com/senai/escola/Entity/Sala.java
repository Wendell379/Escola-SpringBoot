package com.senai.escola.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sala {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int cadeiras;
    private int mesas;
    private int lousas;

    public Sala() {
    }

    public Sala(String nome, int cadeiras, int mesas, int lousas) {
        this.nome = nome;
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.lousas = lousas;
    }

    public Sala(int id, String nome, int cadeiras, int mesas, int lousas) {
        this.id = id;
        this.nome = nome;
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.lousas = lousas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getLousas() {
        return lousas;
    }

    public void setLousas(int lousas) {
        this.lousas = lousas;
    }
}
