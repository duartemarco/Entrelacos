package com.entrelacos.entrelacosweb.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public boolean isActive() {
        return this.active;
    }

}
