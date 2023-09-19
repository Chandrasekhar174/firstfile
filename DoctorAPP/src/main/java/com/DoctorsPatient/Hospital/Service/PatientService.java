package com.DoctorsPatient.Hospital.Service;

import com.DoctorsPatient.Hospital.ExceptionHandler.NotFoundException;
import com.DoctorsPatient.Hospital.Model.Patient;
import com.DoctorsPatient.Hospital.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {

        return patientRepository.save(patient);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Patient not found"));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient updatePatient(Long id, Patient updatedPatient) {
        Patient existingPatient = getPatientById(id);


        if (updatedPatient.getName() != null) {
            existingPatient.setName(updatedPatient.getName());
        }
        if (updatedPatient.getCity() != null) {
            existingPatient.setCity(updatedPatient.getCity());
        }
        if (updatedPatient.getEmail() != null) {
            existingPatient.setEmail(updatedPatient.getEmail());
        }
        if (updatedPatient.getPhoneNumber() != null) {
            existingPatient.setPhoneNumber(updatedPatient.getPhoneNumber());
        }
        if (updatedPatient.getSymptom() != null) {
            existingPatient.setSymptom(updatedPatient.getSymptom());
        }



        return patientRepository.save(existingPatient);
    }

    public void deletePatient(Long id) {
        Patient existingPatient = getPatientById(id);

        patientRepository.delete(existingPatient);
    }
}

