package com.DoctorsPatient.Hospital.Repository;

import com.DoctorsPatient.Hospital.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
