package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>{

}
