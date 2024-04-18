package com.entrelacos.entrelacosweb.entity;

import org.springframework.stereotype.Component;

public class Patient {

    private String name;
    private String cpf;
    private String telephone;
    private String email;
    private boolean active = false;

    public Patient(String name, String cpf, String telephone, String email) {
        this.name = name;
        this.cpf = cpf;
        this.telephone = telephone;
        this.email = email;
    }

    public void activatePatient() {
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
