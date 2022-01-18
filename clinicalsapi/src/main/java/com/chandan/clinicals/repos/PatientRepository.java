package com.chandan.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
