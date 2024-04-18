package com.entrelacos.entrelacosweb.service;

import com.entrelacos.entrelacosweb.entity.Patient;
import com.entrelacos.entrelacosweb.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient){
        return patientRepository.save(patient);
    }
}
