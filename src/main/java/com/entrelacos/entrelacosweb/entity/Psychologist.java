package com.entrelacos.entrelacosweb.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Psychologist extends Employee {

    private String crp;

    public Psychologist(String name, String email, String telephone, String cpf, String crp) {
        super(name, email, telephone, cpf);
        this.crp = crp;
    }


}
