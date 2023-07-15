package com.geekster.Mapping.repository;

import com.geekster.Mapping.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudent extends JpaRepository<Student,Long> {
    @Transactional
    @Modifying
    @Query(value = "update Student set phoneNumber= :phoneNumber where Id= :id",nativeQuery = true)
    void updateInfo(Long id, String phoneNumber);
}
