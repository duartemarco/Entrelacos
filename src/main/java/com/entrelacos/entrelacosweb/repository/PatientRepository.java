package com.entrelacos.entrelacosweb.repository;

import com.entrelacos.entrelacosweb.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
