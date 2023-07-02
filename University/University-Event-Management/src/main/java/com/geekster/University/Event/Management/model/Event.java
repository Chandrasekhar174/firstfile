package com.geekster.University.Event.Management.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "Event")
public class Event {
    @Id
    private Long eventId;
    private String eventName;
    private String locationOfEvent;
    @JsonFormat(pattern = "DD/MM/YYYY")
    private Date date;
    private Time startTime;
    private Time endTime;
}
