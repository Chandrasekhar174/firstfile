package com.geekster.job.repository;

import com.geekster.job.model.StudentJobModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJobRepo extends CrudRepository<StudentJobModel,Long> {

    @Transactional
    @Modifying
    @Query(value = "update StudentJob set Student_salary= :salary set Student_companyName= :companyName where Student_id= :id",nativeQuery = true)
    void update(Long id, Double salary, String companyName);
}
