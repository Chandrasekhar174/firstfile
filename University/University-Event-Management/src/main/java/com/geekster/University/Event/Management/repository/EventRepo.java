package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.Event;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Long> {

    @Transactional
    @Modifying
    @Query(value = "select * from Event where event_date= :date",nativeQuery = true)
    Event getEventByDate(Date date);
}
