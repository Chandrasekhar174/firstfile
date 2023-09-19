package com.DoctorsPatient.Hospital.Service;

import com.DoctorsPatient.Hospital.ExceptionHandler.NotFoundException;
import com.DoctorsPatient.Hospital.Model.Doctor;
import com.DoctorsPatient.Hospital.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {

        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Doctor not found"));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
        Doctor existingDoctor = getDoctorById(id);


        if (updatedDoctor.getName() != null) {
            existingDoctor.setName(updatedDoctor.getName());
        }
        if (updatedDoctor.getCity() != null) {
            existingDoctor.setCity(updatedDoctor.getCity());
        }
        if (updatedDoctor.getEmail() != null) {
            existingDoctor.setEmail(updatedDoctor.getEmail());
        }
        if (updatedDoctor.getPhoneNumber() != null) {
            existingDoctor.setPhoneNumber(updatedDoctor.getPhoneNumber());
        }
        if (updatedDoctor.getSpeciality() != null) {
            existingDoctor.setSpeciality(updatedDoctor.getSpeciality());
        }



        return doctorRepository.save(existingDoctor);
    }

    public void deleteDoctor(Long id) {
        Doctor existingDoctor = getDoctorById(id);

        doctorRepository.delete(existingDoctor);
    }
    public List<Doctor> suggestDoctors(String patientSymptom, String patientCity) {

        List<Doctor> suggestedDoctors = doctorRepository.findBySpecialityAndCity(patientSymptomToSpecialty(patientSymptom), patientCity);

        if (suggestedDoctors.isEmpty()) {
            throw new NotFoundException("No doctors found for the given symptom and city.");
        }

        return suggestedDoctors;
    }

    private String patientSymptomToSpecialty(String patientSymptom) {

        switch (patientSymptom.toLowerCase()) {
            case "arthritis":
            case "back pain":
            case "tissue injuries":
                return "Orthopedic";
            case "dysmenorrhea":
                return "Gynecology";
            case "skin infection":
            case "skin burn":
                return "Dermatology";
            case "ear pain":
                return "ENT specialist";
            default:
                return null;
        }
    }
}
