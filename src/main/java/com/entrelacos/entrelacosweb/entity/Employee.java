package com.entrelacos.entrelacosweb.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;
    private String email;
    private String telephone;
    private String cpf;
    private String jobName;

    public Employee(String name, String email, String telephone, String cpf) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.cpf = cpf;
    }
}
